package com.example.Banco.services.impl;

import com.example.Banco.mappers.ClienteMapper;
import com.example.Banco.models.Cliente;
import com.example.Banco.services.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteMapper clienteMapper;

    public ClienteServiceImpl(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }

    @Override
    public void insertar(Cliente cliente) { clienteMapper.insertar(cliente);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
         clienteMapper.actualizar(cliente);
    }

    @Override
    public boolean borrarCliente(Cliente cliente) {
        return clienteMapper.borrar(cliente.getId());
    }

    @Override
    public Cliente getCliente(int idCliente) {
        return clienteMapper.getCliente(idCliente);
    }

    @Override
    public List<Cliente> getClientes() {
        return clienteMapper.getClientes();
    }
}
