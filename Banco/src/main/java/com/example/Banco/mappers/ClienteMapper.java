package com.example.Banco.mappers;

import com.example.Banco.models.Cliente;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClienteMapper {
    @Select("Select POLIZA_ID, NUM, NIF_TOMADOR from POLIZAMANAGER.POLIZAS where POLIZA_ID = #{idPoliza}")
    @Results(value = {
            @Result(property = "id", column = "POLIZA_ID"),
            @Result(property = "numero", column = "NUM"),
            @Result(property = "nifTomador", column = "NIF_TOMADOR")
    })
    Cliente getCliente(int idCliente);

    @Select("Select id, email, dni from POLIZAMANAGER.POLIZAS")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "numero", column = "dni"),
            @Result(property = "email", column = "email")
    })
    List<Cliente> getPolizas();
    @Insert("Insert into Cliente values (id,dni,nombre,email,telefono,direccion,num,piso,puerta,cod_postal,municipio,sucursal_principal)")
    void insertar();

    @Delete("Delete FROM Cliente WHERE ID = #{id}")
    boolean borrar(int id);
}
