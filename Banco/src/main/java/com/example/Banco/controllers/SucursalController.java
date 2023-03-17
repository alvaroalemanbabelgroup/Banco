package com.example.Banco.controllers;

import com.example.Banco.service.SucursalesService;

public class SucursalController {
    private SucursalesService sucursalesService;

    public SucursalController(SucursalesService sucursalesService){
        this.sucursalesService = sucursalesService;
    }


}
