package com.example.Banco.services;

import com.example.Banco.models.Cliente;

import java.util.List;

public interface ClienteService{
    void insertar(Cliente cliente);
    void actualizarCliente(Cliente cliente);

    boolean borrarCliente(Cliente cliente);
    Cliente getCliente(int idCliente);
    List<Cliente> getClientes();
}
