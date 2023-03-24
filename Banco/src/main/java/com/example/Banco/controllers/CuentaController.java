package com.example.Banco.controllers;


import com.example.Banco.models.Cuenta;
import com.example.Banco.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController
// @RequestMapping("cuentas")
@RestController
@RequestMapping("/cuentas")
public class CuentaController {
    @Autowired
    private final CuentaService cuentaService;

    public CuentaController(CuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }

    @GetMapping("")
    public ResponseEntity<List<Cuenta>> muestraCuentas(Model model){
       // model.addAttribute("listaCuentas",cuentaService.getCuentas());
       // return cuentaService.getCuentas();
        List<Cuenta> cuentas = this.cuentaService.getCuentas();
        return ResponseEntity.ok(cuentas);
    }
}
