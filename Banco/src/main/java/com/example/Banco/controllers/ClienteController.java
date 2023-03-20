package com.example.Banco.controllers;

import com.example.Banco.mappers.ClienteMapper;
import com.example.Banco.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    @Autowired
    ClienteMapper clienteMapper;
    @GetMapping("/cliente")

    public ResponseEntity<Cliente> getCliente(){

        Cliente cliente = this.clienteMapper.getCliente(3);
        return ResponseEntity.ok(cliente);
    }
}
