package com.example.Banco.models;

import java.util.List;

public class Cliente {
    private int id;
    private String DNI;
    private String nombre;
    private String nombreCalle;
    private String num;
    private String piso;
    private String municipio;
    private String codPostal;
    private int sucursalPrincipal;
    private String email;
    private String telefono;
   // private Sucursal sucursalPrincipal;//TODO cambiar a Surcursal
  //  private List<Cuenta> listasDeCuentas;//TODO


    public Cliente(int id, String DNI, String nombre, String nombreCalle, String numero, String municipio, String codPostal, String email, String telefono, int sucursalPrincipal) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.nombreCalle = nombreCalle;
        this.num = numero;
        this.municipio = municipio;
        this.codPostal = codPostal;
        this.email = email;
        this.telefono = telefono;
        this.sucursalPrincipal = sucursalPrincipal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public int getSucursalPrincipal() {
        return sucursalPrincipal;
    }

    public void setSucursalPrincipal(int sucursalPrincipal) {
        this.sucursalPrincipal = sucursalPrincipal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
