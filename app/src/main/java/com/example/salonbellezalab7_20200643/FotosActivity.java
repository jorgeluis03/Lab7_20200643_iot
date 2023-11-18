package com.example.salonbellezalab7_20200643;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.salonbellezalab7_20200643.databinding.ActivityFotosBinding;

public class FotosActivity extends AppCompatActivity {
    ActivityFotosBinding binding;
    ImageButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFotosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnBack = binding.btnBack;

        btnBack.setOnClickListener(v -> {
            getOnBackPressedDispatcher().onBackPressed();
        });

    }
}