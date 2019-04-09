package com.israelermel.retrofitbase.networking.cliente;

import com.google.gson.annotations.SerializedName;

/**
 * Criado por israelermel, data 03/04/19
 */
public class ClienteRequest {

    @SerializedName("nome") public String nome;
    @SerializedName("idade") public Integer idade;
    @SerializedName("cidade") public String cidade;

    public ClienteRequest() {

    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }
}
