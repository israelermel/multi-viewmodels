package com.israelermel.retrofitbase.networking.cliente;

import android.content.Context;

import com.israelermel.retrofitbase.networking.RetrofitFactory;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.Retrofit;

/**
 * Criado por israelermel, data 03/04/19
 */
public class ClienteRequestManager {

    private static ClienteRequestManager instance;

    private ClienteAPIService clienteAPIService;

    private ClienteRequestManager(Context context) {

        Retrofit retrofit = RetrofitFactory.getAdapter();
        clienteAPIService = new ClienteAPIService(retrofit);
    }

    public static ClienteRequestManager getInstance(Context context) {

        synchronized (ClienteRequestManager.class) {
            if (instance == null) {
                instance = new ClienteRequestManager(context);
            }

            return instance;
        }
    }

    public boolean isRequestingInformation() {
        return clienteAPIService.isRequesting();
    }

    public Flowable<List<ClienteRequest>> getTodosClientes() {
        return clienteAPIService.getGames();
    }
}
