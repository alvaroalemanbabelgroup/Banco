package com.example.Banco.controllers;

import com.example.Banco.models.Sucursal;
import com.example.Banco.service.SucursalesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class SucursalController {
    private SucursalesService sucursalesService;

    public SucursalController(SucursalesService sucursalesService){
        this.sucursalesService = sucursalesService;
    }

    @PostMapping("/alta")
    public void alta(Sucursal sucursal){
        this.sucursalesService.alta(sucursal);
    }

    @PostMapping("/modificar")
    public void modificar(Sucursal sucursalVieja, Sucursal sucursalNueva){
        this.sucursalesService.modificar(sucursalVieja, sucursalNueva);
    }

    @GetMapping("/listar")
    public List<Sucursal> listar(){
        return this.sucursalesService.listar();
    }
}
