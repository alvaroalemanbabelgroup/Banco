package com.example.Banco.services;

import com.example.Banco.models.Cuenta;
import com.example.Banco.repositories.CuentaMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CuentaServiceImpl implements CuentaService{

    private final CuentaMapper cuentaMapper;

    public CuentaServiceImpl(CuentaMapper cuentaMapper) {
        this.cuentaMapper = cuentaMapper;
    }

    @Override
    public List<Cuenta> getCuentas() {
        return cuentaMapper.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public Cuenta add(Cuenta cuenta) {
        return cuentaMapper.add(cuenta);
    }
}
