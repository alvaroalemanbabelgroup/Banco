package com.example.Banco.mappers;

import com.example.Banco.models.Cliente;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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

}
