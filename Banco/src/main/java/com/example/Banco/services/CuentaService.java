package com.example.Banco.services;

import com.example.Banco.models.Cuenta;

import java.util.List;

public interface CuentaService {
    List<Cuenta> getCuentas();

    Cuenta add(Cuenta cuenta);
}
