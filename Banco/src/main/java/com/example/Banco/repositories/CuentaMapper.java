package com.example.Banco.repositories;

import com.example.Banco.models.Cuenta;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;
import java.util.Optional;

//todo: Terminar la clase Mapper

@Mapper
public interface CuentaMapper {

    Collection<Cuenta> findAll();

    @Select("Select id_cuenta, numero_cuenta, sucursal, id_usuario, balance from cuenta.")
    Optional<Cuenta> findById(int id);
    Optional<Cuenta> findByCuenta(int numero_cuenta);

    Cuenta add(Cuenta cuenta);
}
