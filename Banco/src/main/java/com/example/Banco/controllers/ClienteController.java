package com.example.Banco.controllers;

import com.example.Banco.mappers.ClienteMapper;
import com.example.Banco.models.Cliente;
import com.example.Banco.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteMapper clienteMapper;
    private ClienteService cliente;
    public ClienteController(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }
    @GetMapping("")
    public ResponseEntity<Cliente> listar(){

        Cliente cliente = this.clienteMapper.getCliente(3);
        return ResponseEntity.ok(cliente);
    }

    // /cliente?id=1

    // /cliente?dni=32423

    @GetMapping("")
    public ResponseEntity<Cliente> getClienteById(@RequestParam int id, @RequestParam String dni){

        Cliente cliente = this.clienteMapper.getCliente(id);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping("")
    public Cliente anyadirCliente(@RequestBody Cliente cliente){
        return this.cliente.anyadir(cliente);
    }

    @PutMapping("")
    public Cliente modificar(@RequestBody Cliente cliente){
        return this.cliente.actualizar(cliente);
    }

}
