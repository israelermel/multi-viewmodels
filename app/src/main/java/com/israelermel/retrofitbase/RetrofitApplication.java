package com.israelermel.retrofitbase;

import android.app.Application;

import timber.log.Timber;

/**
 * Criado por israelermel, data 09/04/19
 */
public class RetrofitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

}
