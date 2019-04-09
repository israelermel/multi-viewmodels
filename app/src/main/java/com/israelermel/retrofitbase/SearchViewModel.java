package com.israelermel.retrofitbase;

import android.databinding.ObservableField;

/**
 * Criado por israelermel, data 09/04/19
 */
public class SearchViewModel {
    public final ObservableField<String> resultado = new ObservableField<>("nao existe");


    public void add(String valor) {
        resultado.set(valor);
    }
}
