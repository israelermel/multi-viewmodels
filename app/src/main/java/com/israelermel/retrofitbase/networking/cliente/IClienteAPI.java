package com.israelermel.retrofitbase.networking.cliente;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Criado por israelermel, data 03/04/19
 */
public interface IClienteAPI {

    @GET("cliente")
    Observable<List<ClienteRequest>> getTodosClientes();

}
