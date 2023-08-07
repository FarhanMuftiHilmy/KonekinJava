package com.example.modulretrofit.model


import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("data")
    val `data`: List<Data>
)