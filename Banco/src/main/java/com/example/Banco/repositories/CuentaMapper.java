package com.example.Banco.repositories;

import com.example.Banco.models.Cuenta;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

//todo: Terminar la clase Mapper

@Mapper
public interface CuentaMapper {

    @Select("Select ID, NUMERO_CUENTA, ID_CLIENTE, BALANCE from BANCO.CUENTA")
    @Results(value = {
            @Result(property = "idCuenta", column = "ID"),
            @Result(property = "numeroCuenta", column = "NUMERO_CUENTA"),
            @Result(property = "idCliente", column = "ID_CLIENTE"),
            @Result(property = "balance", column = "BALANCE")})
    List<Cuenta> findAll();

    @Select("Select ID, NUMERO_CUENTA, ID_CLIENTE, BALANCE from BANCO.CUENTA WHERE ID = #{id}")
    @Results(value = {
            @Result(property = "idCuenta", column = "ID"),
            @Result(property = "numeroCuenta", column = "NUMERO_CUENTA"),
            @Result(property = "idCliente", column = "ID_CLIENTE"),
            @Result(property = "balance", column = "BALANCE")})
    Optional<Cuenta> findById(int id);

    @Select("Select ID, NUMERO_CUENTA, sucursal, ID_CLIENTE, BALANCE from BANCO.CUENTA WHERE ID = #{numero_cuenta}")
    @Results(value = {
            @Result(property = "numeroCuenta", column = "ID"),
            @Result(property = "nombreSucursal", column = "sucursal"),
            @Result(property = "idUsuario", column = "ID_CLIENTE"),
            @Result(property = "balance", column = "BALANCE")})
    Optional<Cuenta> findByCuenta(int id);

}
