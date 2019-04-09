package com.israelermel.retrofitbase.networking.cliente;

import com.israelermel.retrofitbase.networking.cliente.exception.ClienteException;

import java.util.List;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Criado por israelermel, data 03/04/19
 */
public class ClienteAPIService {

    private IClienteAPI clienteAPI;
    private boolean isRequesting;

    public ClienteAPIService(Retrofit retrofit) {
        this.clienteAPI = retrofit.create(IClienteAPI.class);
    }

    public boolean isRequesting() {
        return isRequesting;
    }


    public Flowable<List<ClienteRequest>> getGames() {

        return clienteAPI.getTodosClientes()
                .doOnSubscribe(disposable -> isRequesting = true)
                .doOnTerminate(() -> isRequesting = false)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnError(this::handleAccountError)
                .toFlowable(BackpressureStrategy.BUFFER);
    }

    private void handleAccountError(Throwable throwable) {
        throw new ClienteException();
    }
}
