package com.example.binario.controller;

public class BinarioRequest {
    private Integer numero;

    public BinarioRequest() {
    }

    public BinarioRequest(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
}
