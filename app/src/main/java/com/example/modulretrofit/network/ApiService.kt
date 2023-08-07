package com.example.modulretrofit.network

import com.example.modulretrofit.model.Users
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("employees")
    fun getAllUsers(): Call<Users>

}