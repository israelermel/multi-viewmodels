package com.israelermel.retrofitbase;

import android.databinding.ObservableField;

/**
 * Criado por israelermel, data 09/04/19
 */
public class SearchViewModel {
    public final ObservableField<String> resultado = new ObservableField<>("nao existe");

    public OnClickBtnListener onListener() {
        return new OnClickBtnListener() {
            @Override
            public void onClick(String valor) {
                add("teste:" + valor);
            }
        };
    }

    public void add(String valor) {
        resultado.set(valor);
    }
}
