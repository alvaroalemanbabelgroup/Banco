package com.example.Banco.repositories;

import com.example.Banco.models.Cuenta;

import java.util.Collection;
import java.util.Optional;

//todo: Terminar la clase Mapper
@Mapper
public interface CuentaMapper {

    Collection<Cuenta> findAll();

    @Select("Select NUMERO_CUENTA, NOMBRE_SUCURSAL, ID_USUARIO, BALANCE from BANCO.")
    Optional<Cuenta> findById(int id);
    Optional<Cuenta> findByCuenta(int numeroCuenta);

    Cuenta add(Cuenta cuenta);
}
