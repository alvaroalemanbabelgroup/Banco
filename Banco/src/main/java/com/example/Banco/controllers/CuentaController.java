package com.example.Banco.controllers;


import com.example.Banco.services.CuentaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {

    private final CuentaService cuentaService;

    public CuentaController(CuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }

    @GetMapping("")
    public String muestraCuentas(Model model){
        model.addAttribute("listaCuentas",cuentaService.getCuentas());
        return "Muestra cuentas";
    }
}
