package com.example.Banco.repositories;

import com.example.Banco.models.Sucursal;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SucursalRepositoryMyBatis {


    //TODO: Implementar sentencia SQL con los nombres cuando los tengamos
    @Insert("INSERT INTO...")
    public void alta(Sucursal sucursal);


    //TODO: Implementar/corregir sentencia SQL con los nombres cuando los tengamos
    @Select("SELECT ................")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "nombre", column = "nombre"),
            @Result(property = "director", column = "director"),
            @Result(property = "direccion", column = "direccion")

    })
    public List<Sucursal> listar();


    public void borrar(Sucursal sucursal);


    public void modificar(Sucursal sucursalvieja, Sucursal sucursalNueva);
}
