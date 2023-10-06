package com.example.modulretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.modulretrofit.databinding.ActivityMainJavaBinding;
import com.example.modulretrofit.model.DataJava;
import com.example.modulretrofit.model.UsersJava;
import com.example.modulretrofit.network.ApiClientJava;
import com.example.modulretrofit.network.ApiServiceJava;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityJava extends AppCompatActivity {

    private ActivityMainJavaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainJavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ApiServiceJava client = ApiClientJava.getInstance();
        Call<UsersJava> response = client.getAllUsers();
        List<String> userList = new ArrayList<>();

        response.enqueue(new Callback<UsersJava>() {
            @Override
            public void onResponse(Call<UsersJava> call, Response<UsersJava> response) {
                for (DataJava data : response.body().getData()) {
                    userList.add(data.getEmployeeName());
                }

                ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
                        MainActivityJava.this,
                        android.R.layout.simple_list_item_1,
                        userList
                );
                binding.lvNama.setAdapter(listAdapter);
            }

            @Override
            public void onFailure(Call<UsersJava> call, Throwable t) {
                Toast.makeText(MainActivityJava.this, "Koneksi error", Toast.LENGTH_LONG).show();
            }
        });
    }
}