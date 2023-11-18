package com.example.salonbellezalab7_20200643.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.salonbellezalab7_20200643.R;
import com.example.salonbellezalab7_20200643.entity.Citas;
import com.example.salonbellezalab7_20200643.utils.FirebaseUtils;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class ListaCitasAdapter extends FirestoreRecyclerAdapter<Citas, ListaCitasAdapter.CitasViewHolder> {
    Context context;

    public ListaCitasAdapter(@NonNull FirestoreRecyclerOptions<Citas> options,Context context) {
        super(options);
        this.context = context;
    }

    @Override
    protected void onBindViewHolder(@NonNull CitasViewHolder holder, int position, @NonNull Citas model) {
        holder.horacita.setText(FirebaseUtils.timestampToString(model.getHora()));
        holder.tipoCita.setText(model.getTipoServicio());
        holder.correcliente.setText(model.getCorreoCliente());
    }

    @NonNull
    @Override
    public CitasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.irv_citas,parent,false);
        return new CitasViewHolder(view);
    }


    class CitasViewHolder extends RecyclerView.ViewHolder{
        TextView horacita, tipoCita, correcliente;
        public CitasViewHolder(@NonNull View itemView) {
            super(itemView);
            horacita = itemView.findViewById(R.id.horacita);
            tipoCita = itemView.findViewById(R.id.tiposerivico);
            correcliente = itemView.findViewById(R.id.correocliente);

        }
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
