package com.example.Banco.controllers;


import com.example.Banco.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/Cuenta")
    public String muestraCuentas(Model model){
        model.addAttribute("listaCuentas",cuentaService.getCuentas());
        return "muestraCuentas";
    }
}
