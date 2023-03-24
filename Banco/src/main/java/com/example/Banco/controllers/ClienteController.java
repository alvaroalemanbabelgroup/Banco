package com.example.Banco.controllers;

import com.example.Banco.mappers.ClienteMapper;
import com.example.Banco.models.Cliente;
import com.example.Banco.services.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
     ResponseEntity<List<Cliente>> listar(){
        List<Cliente> listaCliente = new ArrayList<>();
        listaCliente = this.clienteMapper.getClientes();

        return ResponseEntity.ok(listaCliente);
    }

    @GetMapping("/{id}")
     ResponseEntity<Cliente> listaCliente(@RequestParam int id){
        return ResponseEntity.ok(this.clienteMapper.getCliente(id));
    }


    @PostMapping("")
     void anyadirCliente(@RequestBody Cliente cliente){
        this.cliente.insertar(cliente);
    }

    @PutMapping("")
     ResponseEntity<String> actualizar(@RequestBody Cliente cliente) {
         this.clienteMapper.actualizar(cliente);
         return ResponseEntity.ok("Cliente actualizado");
    }

    @DeleteMapping("")
     ResponseEntity<String> borrarCliente(@RequestParam int id){
        boolean borrado = this.clienteMapper.borrar(id);
        if(borrado){
            return ResponseEntity.ok("Cliente borrado con id: " + id);
        }
        return ResponseEntity.ok("Error al borrar el cliente: " + id);

    }

}
