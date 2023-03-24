package com.example.Banco.mappers;

import com.example.Banco.models.Cliente;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClienteMapper {
    @Select("Select ID,DNI,NOMBRE,EMAIL,TELEFONO,DIRECCION,NUM,PISO,PUERTA,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL,ID_CLIENTE from BANCO.CLIENTE from BANCO.CLIENTE where ID = #{id}")
    Cliente getCliente(int idCliente);

    @Select("Select ID,DNI,NOMBRE,EMAIL,TELEFONO,DIRECCION,NUM,PISO,PUERTA,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL,ID_CLIENTE from BANCO.CLIENTE")
    List<Cliente> getClientes();
    @Insert("Insert into Cliente (DNI,NOMBRE,EMAIL,TELEFONO,DIRECCION,NUM,PISO,PUERTA,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL,ID_CLIENTE) " +
            "values (#{DNI, jdbcType=VARCHAR},#{nombre, jdbcType=VARCHAR},#{email, jdbcType=VARCHAR},#{telefono, jdbcType=VARCHAR},#{direccion, jdbcType=VARCHAR}" +
            ",#{num, jdbcType=VARCHAR},#{piso},#{puerta},#{codPostal, jdbcType=CHAR},#{municipio, jdbcType=VARCHAR},#{sucursalPrincipal, jdbcType=NUMERIC}#{idCliente})")
    @Options(useGeneratedKeys = true,keyProperty = "id", keyColumn = "ID")
    void insertar(Cliente cliente);

    @Delete("Delete FROM Cliente WHERE ID = #{id}")
    boolean borrar(int id);

    @Update("Update Cliente set dni=#{dni}, nombre=#{nombre}, email=#{email}, telefono=#{telefono}, direccion=#{direccion}, num=#{num}, piso=#{piso}" +
            "puerta=#{puerta}, cod_postal=#{cod_postal}, municipio=#{municipio}, sucursal_principal=#{sucursal_principal} where id=#{id}")
    @Options(useGeneratedKeys = true,keyProperty = "id", keyColumn = "ID")
    void actualizar(Cliente cliente);
}
