package com.example.salonbellezalab7_20200643.entity;

import com.google.firebase.Timestamp;

public class Citas {
    private String correoCliente;
    private String tipoServicio;
    private Timestamp hora;


    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }
}
