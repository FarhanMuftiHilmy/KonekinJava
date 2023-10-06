package com.example.modulretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UsersJava {
    @SerializedName("data")
    private List<DataJava> data;

    public List<DataJava> getData() {
        return data;
    }
}
