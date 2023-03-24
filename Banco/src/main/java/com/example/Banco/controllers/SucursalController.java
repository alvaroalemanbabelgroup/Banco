package com.example.Banco.controllers;

import com.example.Banco.models.Sucursal;
import com.example.Banco.service.SucursalesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {
    private SucursalesService sucursalesService;

    public SucursalController(SucursalesService sucursalesService){

        this.sucursalesService = sucursalesService;
    }

    @PostMapping("")
    ResponseEntity alta(@RequestBody Sucursal sucursal){
        this.sucursalesService.alta(sucursal);
        return ResponseEntity.ok(sucursal);
    }

    @PutMapping("")
    ResponseEntity<Sucursal> modificar(Sucursal sucursalVieja, Sucursal sucursalNueva){
        this.sucursalesService.modificar(sucursalVieja, sucursalNueva);
        return ResponseEntity.ok(sucursalNueva);
    }

    @GetMapping("")
    ResponseEntity<List<Sucursal>> listar(){
        this.sucursalesService.listar();
        return ResponseEntity.ok(sucursalesService.listar());
    }

    @DeleteMapping("")
    ResponseEntity<String> borrar(@RequestBody Sucursal sucursal){
        this.sucursalesService.borrar(sucursal);
        return ResponseEntity.ok("Borrado id:"+sucursal.getId());
    }
}
