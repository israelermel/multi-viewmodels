package com.israelermel.retrofitbase;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.israelermel.retrofitbase.databinding.ActivityMainBinding;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ClienteViewModel clienteViewModel = new ClienteViewModel();

        SearchViewModel searchViewModel = new SearchViewModel();

        clienteViewModel.setListener(new OnClickBtnListener() {
            @Override
            public void onClick(String valor) {
                searchViewModel.add(valor);
            }
        });

        binding.setViewModel(clienteViewModel);
        binding.setSearchVM(searchViewModel);

        binding.executePendingBindings();

//        ClienteRequestManager requestManager = ClienteRequestManager.getInstance(getApplicationContext());
//
//
//        Flowable<List<ClienteRequest>> todosClientes = requestManager.getTodosClientes();
//
//        todosClientes.subscribe(new FlowableSubscriber<List<ClienteRequest>>() {
//            @Override
//            public void onSubscribe(Subscription s) {
//
//            }
//
//            @Override
//            public void onNext(List<ClienteRequest> clienteRequests) {
//
//            }
//
//            @Override
//            public void onError(Throwable t) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });
//        Log.d("israel", "teste");


//        Retrofit rxTutorialRetrofit = new Retrofit.Builder()
//                .baseUrl("http://teste.com.br")
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .client(httpClient.build())
//                .build();


    }
}
