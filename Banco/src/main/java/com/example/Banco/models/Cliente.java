package com.example.Banco.models;

import java.util.List;

public class Cliente {
    private int idCliente;
    private String DNI;
    private String nombre;
    private String email;
    private String direccion;
    private String num;
    private String piso;
    private String puerta;
    private String municipio;
    private String codPostal;
    private int sucursalPrincipal;

    private String telefono;
   // private Sucursal sucursalPrincipal;//TODO cambiar a Surcursal
  //  private List<Cuenta> listasDeCuentas;//TODO



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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
