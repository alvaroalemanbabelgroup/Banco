package com.example.Banco.models;

public class Cuenta {
    private int numeroCuenta;
    private String nombreSucursal;
    private int idUsuario;
    private float balance;

    public Cuenta(int numeroCuenta, String nombreSucursal, int idUsuario, float balance) {
        this.numeroCuenta = numeroCuenta;
        this.nombreSucursal = nombreSucursal;
        this.idUsuario = idUsuario;
        this.balance = balance;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
