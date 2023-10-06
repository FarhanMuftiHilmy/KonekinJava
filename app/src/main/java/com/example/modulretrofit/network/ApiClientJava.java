package com.example.modulretrofit.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientJava {

    public static ApiServiceJava getInstance() {
        HttpLoggingInterceptor mHttpLoggingInterceptor = new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .addInterceptor(mHttpLoggingInterceptor)
                .build();

        Retrofit builder = new Retrofit.Builder()
                .baseUrl("https://dummy.restapiexample.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(mOkHttpClient)
                .build();

        return builder.create(ApiServiceJava.class);
    }
}