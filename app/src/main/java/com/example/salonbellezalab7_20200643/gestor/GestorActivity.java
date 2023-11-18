package com.example.salonbellezalab7_20200643.gestor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.salonbellezalab7_20200643.DatosSalonActivity;
import com.example.salonbellezalab7_20200643.FotosActivity;
import com.example.salonbellezalab7_20200643.R;
import com.example.salonbellezalab7_20200643.adapter.ListaCitasAdapter;
import com.example.salonbellezalab7_20200643.databinding.ActivityGestorBinding;
import com.example.salonbellezalab7_20200643.entity.Citas;
import com.example.salonbellezalab7_20200643.utils.FirebaseUtils;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.Query;

public class GestorActivity extends AppCompatActivity {
    ActivityGestorBinding binding;
    Query query;
    ListaCitasAdapter adapter;
    RecyclerView recyclerView;
    Button btnDatosSalon, btnFotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGestorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recyclerView = binding.recycleViewCitas;
        btnDatosSalon = binding.btnDatosSalon;
        btnFotos = binding.btnFotos;

        btnFotos.setOnClickListener(v -> {
            startActivity(new Intent(this, FotosActivity.class));
        });


        btnDatosSalon.setOnClickListener(v -> {
            startActivity(new Intent(this, DatosSalonActivity.class));
        });

        cargarCitas();
    }

    public void cargarCitas(){
        query = FirebaseUtils.getCitasCollection();

        FirestoreRecyclerOptions<Citas> options = new FirestoreRecyclerOptions.Builder<Citas>()
                .setQuery(query,Citas.class).build();

        adapter = new ListaCitasAdapter(options,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.startListening();

    }
}