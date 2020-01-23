package com.example.retrofitwebservice;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFit {
static Retrofit retrofit;
    public static Retrofit getRetrofit()
    {
        if(retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }
    public static RetroFitApi getRetrofitApi()
    {
        return getRetrofit().create(RetroFitApi.class);
    }

}
