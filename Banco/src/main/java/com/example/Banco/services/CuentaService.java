package com.example.Banco.services;

import com.example.Banco.models.Cuenta;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CuentaService {
    List<Cuenta> getCuentas();

    Cuenta add(Cuenta cuenta);
}
