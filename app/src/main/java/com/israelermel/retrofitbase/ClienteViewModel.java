package com.israelermel.retrofitbase;

import android.databinding.ObservableField;

/**
 * Criado por israelermel, data 09/04/19
 */
public class ClienteViewModel {

    public final ObservableField<String> titulo = new ObservableField<>("israel");
    private OnClickBtnListener mListener;

    public void onEnviar() {
        titulo.set("ermel");
        mListener.onClick(titulo.get());
    }

    public void setListener(OnClickBtnListener listener) {
        mListener = listener;
    }
}
