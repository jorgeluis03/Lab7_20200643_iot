package com.example.salonbellezalab7_20200643;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.salonbellezalab7_20200643.databinding.ActivityDatosSalonBinding;

public class DatosSalonActivity extends AppCompatActivity {
    ActivityDatosSalonBinding binding;
    ImageButton btnBack;
    Button btnFotos, btnCitasDia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatosSalonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnBack = binding.btnBack;


        btnBack.setOnClickListener(v -> {
            getOnBackPressedDispatcher().onBackPressed();
        });
    }
}