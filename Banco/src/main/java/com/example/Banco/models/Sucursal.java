package com.example.Banco.models;

public class Sucursal {
    private int id;
    private String nombre;
    private String direccion;
    private String num;
    private String piso;
    private String puerta;
    private String cod_postal;
    private String municipio;
    private String director;


    public Sucursal(int id, String nombre, String direccion, String num, String piso, String puerta, String cod_postal, String municipio, String director) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.num = num;
        this.piso = piso;
        this.puerta = puerta;
        this.cod_postal = cod_postal;
        this.municipio = municipio;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
