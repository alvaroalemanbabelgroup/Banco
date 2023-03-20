package com.example.Banco.controllers;

import com.example.Banco.mappers.ClienteMapper;
import com.example.Banco.models.Cliente;
import com.example.Banco.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banco")
public class ClienteController {

    private ClienteMapper clienteMapper;
    private ClienteService cliente;
    public ClienteController(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }
    @GetMapping("/cliente")
    public ResponseEntity<Cliente> getCliente(){

        Cliente cliente = this.clienteMapper.getCliente(3);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping("/anyadir")
    public Cliente anyadirCliente(@RequestParam Cliente cliente){
        return this.cliente.anyadir(cliente);
    }

}
