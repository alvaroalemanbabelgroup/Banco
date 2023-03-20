package com.example.Banco.controllers;

import com.example.Banco.mappers.ClienteMapper;
import com.example.Banco.models.Cliente;
import com.example.Banco.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {



    private ClienteMapper clienteMapper;
    private ClienteService cliente;

    public ClienteController(ClienteMapper clienteMapper, ClienteService cliente) {
        this.clienteMapper = clienteMapper;
        this.cliente = cliente;
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
    public ResponseEntity<String> actualizar(@RequestParam int id) {
        boolean actualizado = this.clienteMapper.actualizar(id);
        if(actualizado){
            return  ResponseEntity.ok("Cliente actualizado con id: " + id);
        } else {
            return ResponseEntity.ok("Cliente con id: " + id + " no actualizado.");
        }
    }
    @DeleteMapping("")
    public ResponseEntity<String> borrarCliente(@RequestParam int id){
        boolean borrado = this.clienteMapper.borrar(id);
        if(borrado){
            return ResponseEntity.ok("Cliente borrado con id: " + id);
        }
        return ResponseEntity.ok("Error al borrar el cliente: " + id);

    }



}
