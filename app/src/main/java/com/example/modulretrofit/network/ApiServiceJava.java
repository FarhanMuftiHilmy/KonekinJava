package com.example.modulretrofit.network;

import com.example.modulretrofit.model.UsersJava;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServiceJava {

    @GET("employees")
    Call<UsersJava> getAllUsers();

}