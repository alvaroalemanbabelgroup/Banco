package com.example.Banco.mappers;

import com.example.Banco.models.Cliente;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClienteMapper {
    @Select("Select ID,DNI,NOMBRE,EMAIL,TELEFONO,DIRECCIÓN,NUM,PISO,PUERTA,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL,ID_CLIENTE from BANCO.CLIENTE from BANCO.CLIENTE where ID = #{id}")
    Cliente getCliente(int idCliente);

    @Select("Select ID,DNI,NOMBRE,EMAIL,TELEFONO,DIRECCIÓN,NUM,PISO,PUERTA,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL,ID_CLIENTE from BANCO.CLIENTE")
    List<Cliente> getClientes();
    @Insert("Insert into Cliente (DNI,NOMBRE,EMAIL,TELEFONO,DIRECCIÓN,NUM,PISO,PUERTA,COD_POSTAL,MUNICIPIO,SUCURSAL_PRINCIPAL,ID_CLIENTE) " +
            "values (#{DNI},#{nombre},#{email},#{telefono, jdbcType=VARCHAR},#{direccion}" +
            ",#{num},#{piso, jdbcType=VARCHAR},#{puerta, jdbcType=VARCHAR},#{codPostal},#{municipio},#{sucursalPrincipal}#{idCliente, jdbcType=NUMERIC})")
    @Options(useGeneratedKeys = true,keyProperty = "id", keyColumn = "ID")
    void insertar(Cliente cliente);

    @Delete("Delete FROM Cliente WHERE ID = #{id}")
    boolean borrar(int id);

    @Update("Update Cliente set dni=#{dni}, nombre=#{nombre}, email=#{email}, telefono=#{telefono}, direccion=#{direccion}, num=#{num}, piso=#{piso}" +
            "puerta=#{puerta}, cod_postal=#{cod_postal}, municipio=#{municipio}, sucursal_principal=#{sucursal_principal} where id=#{id}")
    @Options(useGeneratedKeys = true,keyProperty = "id", keyColumn = "ID")
    void actualizar(Cliente cliente);
}
