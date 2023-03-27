package com.example.Banco.mappers;

import com.example.Banco.models.Cliente;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClienteMapper {
    @Select("Select ID_CLIENTE,DNI,NOMBRE,EMAIL,TELEFONO,DIRECCIÓN,NUM,PISO,PUERTA,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL from BANCO.CLIENTE where ID_CLIENTE = #{idCliente}")
    @Results({
            @Result(property = "idCliente", column = "ID_CLIENTE"),
            @Result(property = "DNI", column = "DNI"),
            @Result(property = "DNI", column = "DNI"),
            @Result(property = "nombre", column = "NOMBRE"),
            @Result(property = "email", column = "EMAIL"),
            @Result(property = "telefono", column = "TELEFONO"),
            @Result(property = "direccion", column = "DIRECCIÓN"),
            @Result(property = "num", column = "NUM"),
            @Result(property = "piso", column = "PISO"),
            @Result(property = "puerta", column = "PUERTA"),
            @Result(property = "codPostal", column = "COD_POSTAL"),
            @Result(property = "municipio", column = "MUNICIPIO"),
            @Result(property = "sucursalPrincipal", column = "SUCURSAL_PRINCIPAL"),
    })
    Cliente getCliente(int idCliente);

    @Select("Select ID_CLIENTE,DNI,NOMBRE,EMAIL,TELEFONO,DIRECCIÓN,NUM,PISO,PUERTA,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL from BANCO.CLIENTE")
    @Results({
            @Result(property = "idCliente", column = "ID_CLIENTE"),
            @Result(property = "DNI", column = "DNI"),
            @Result(property = "DNI", column = "DNI"),
            @Result(property = "nombre", column = "NOMBRE"),
            @Result(property = "email", column = "EMAIL"),
            @Result(property = "telefono", column = "TELEFONO"),
            @Result(property = "direccion", column = "DIRECCIÓN"),
            @Result(property = "num", column = "NUM"),
            @Result(property = "piso", column = "PISO"),
            @Result(property = "puerta", column = "PUERTA"),
            @Result(property = "codPostal", column = "COD_POSTAL"),
            @Result(property = "municipio", column = "MUNICIPIO"),
            @Result(property = "sucursalPrincipal", column = "SUCURSAL_PRINCIPAL"),
    })
    List<Cliente> getClientes();
    @Insert("Insert into Cliente (DNI,NOMBRE,EMAIL,TELEFONO,DIRECCIÓN,NUM,PISO,PUERTA,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL) " +
            "values (#{DNI},#{nombre},#{email},#{telefono, jdbcType=VARCHAR},#{direccion}" +
            ",#{num},#{piso, jdbcType=VARCHAR},#{puerta, jdbcType=VARCHAR},#{codPostal},#{municipio},#{sucursalPrincipal})")
    @Options(useGeneratedKeys = true,keyProperty = "idCliente", keyColumn = "ID_CLIENTE")
    void insertar(Cliente cliente);

    @Delete("Delete FROM Cliente WHERE ID_CLIENTE = #{idCliente}")
    boolean borrar(int id);

    @Update("Update Cliente set dni=#{dni}, nombre=#{nombre}, email=#{email}, telefono=#{telefono}, direccion=#{direccion}, num=#{num}, piso=#{piso}" +
            "puerta=#{puerta}, cod_postal=#{cod_postal}, municipio=#{municipio}, sucursal_principal=#{sucursal_principal} where ID_CLIENTE=#{idCliente}")
    @Options(useGeneratedKeys = true,keyProperty = "idCliente", keyColumn = "ID_CLIENTE")
    void actualizar(Cliente cliente);

    //TODO Arreglar actualizar, salta error METHOD NOT ALLOWED al intentar actualizar un cliente
}
