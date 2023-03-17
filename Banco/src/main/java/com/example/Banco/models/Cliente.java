package com.example.Banco.models;

public class Cliente {
    private int id;
    private String DNI;
    private String nombre;
    private String calle;
    private String numero;
    private String localidad;
    private String municipio;
    private String codigoPostal;
    private String email;
    private int telefono;
    private String sucursalPrincipal;

    public Cliente(int id, String DNI, String nombre, String calle, String numero, String localidad, String municipio, String codigoPostal, String email, int telefono, String sucursalPrincipal) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.municipio = municipio;
        this.codigoPostal = codigoPostal;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSucursalPrincipal() {
        return sucursalPrincipal;
    }

    public void setSucursalPrincipal(String sucursalPrincipal) {
        this.sucursalPrincipal = sucursalPrincipal;
    }
}
