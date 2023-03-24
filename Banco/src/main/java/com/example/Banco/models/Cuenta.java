package com.example.Banco.models;

public class Cuenta {
    private int idCuenta;
    private String numeroCuenta;
    private int idCliente;
    private float balance;

    public Cuenta(int numeroCuenta, String nombreSucursal, int idUsuario, float balance) {
        this.idCuenta = numeroCuenta;
        this.numeroCuenta = nombreSucursal;
        this.idCliente = idUsuario;
        this.balance = balance;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
