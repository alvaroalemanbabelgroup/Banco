package com.example.Banco.services.impl;

import com.example.Banco.models.Cliente;
import com.example.Banco.services.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public Cliente anyadir(Cliente cliente) {
        return cliente;
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return null;
    }
}
