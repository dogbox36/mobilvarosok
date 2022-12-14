package com.example.varosok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.gson.Gson;

import com.example.varosok.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    public static String BASE_URL = "https://retoolapi.dev/AAt5jw/varosok";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.submitButton.setOnClickListener((e)-> {
            Intent intent = new Intent(this, InsertActivity.class);
            startActivity(intent);
            finish();
        });

        binding.listButton.setOnClickListener((e)-> {
            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
            finish();
        });

    }
}