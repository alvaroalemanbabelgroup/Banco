package com.example.Banco.mappers;

import com.example.Banco.models.Cliente;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClienteMapper {
    @Select("Select POLIZA_ID, NUM, NIF_TOMADOR from POLIZAMANAGER.POLIZAS where POLIZA_ID = #{idPoliza}")
    Cliente getCliente(int idCliente);

    @Select("Select id, email, dni from POLIZAMANAGER.POLIZAS")
    List<Cliente> getPolizas();
    @Insert("Insert into Cliente (ID,DNI,NOMBRE,EMAIL,TELEFONO,NOMBRE_CALLE,NUM,PISO,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL) " +
            "values (#{id, jdbcType=NUMERIC},#{DNI, jdbcType=VARCHAR},#{nombre, jdbcType=VARCHAR},#{email, jdbcType=VARCHAR},#{telefono, jdbcType=VARCHAR},#{nombreCalle, jdbcType=VARCHAR}" +
            ",#{num, jdbcType=VARCHAR},#{piso},#{codPostal, jdbcType=CHAR},#{municipio, jdbcType=VARCHAR},#{sucursalPrincipal, jdbcType=NUMERIC})")
    void insertar(Cliente cliente);

    @Delete("Delete FROM Cliente WHERE ID = #{id}")
    boolean borrar(int id);

    @Update("Update Cliente set dni=#{dni}, nombre=#{nombre}, email=#{email}, telefono=#{telefono}, direccion=#{direccion}, num=#{num}, piso=#{piso}" +
            "puerta=#{puerta}, cod_postal=#{cod_postal}, municipio=#{municipio}, sucursal_principal=#{sucursal_principal} where id=#{id}")
    boolean actualizar(int id);
}
