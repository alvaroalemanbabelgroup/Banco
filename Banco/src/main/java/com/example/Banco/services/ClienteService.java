package com.example.Banco.services;

import com.example.Banco.models.Cliente;

import java.util.List;

public interface ClienteService{
    Cliente anyadir(Cliente cliente);
    Cliente actualizarCliente(Cliente cliente);

    Cliente borrarCliente(Cliente cliente);
    Cliente getCliente(int idCliente);
    List<Cliente> getClientes();
}
