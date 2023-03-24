package com.example.Banco.repositories;

import com.example.Banco.models.Sucursal;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SucursalRepositoryMyBatis {

    //TODO: Implementar sentencia SQL con los nombres cuando los tengamos
    @Insert("INSERT INTO SUCURSAL(ID, NOMBRE, DIRECCION, NUM, PISO, PUERTA, COD_POSTAL, MUNICIPIO, DIRECTOR) " +
            "VALUES(#{sucursal.id}, #{sucursal.nombre}, #{sucursal.direccion}, #{sucursal.num}, #{sucursal.piso}," +
            " #{sucursal.puerta}, #{sucursal.cod_postal}, #{sucursal.municipio}, #{sucursal.director},)")
    public void alta(Sucursal sucursal);


    //TODO: Implementar/corregir sentencia SQL con los nombres cuando los tengamos
    @Select("SELECT ID,NOMBRE,DIRECCION, NUM, PISO, PUERTA, COD_POSTAL, MUNICIPIO, DIRECTOR FROM SUCURSAL")
    public List<Sucursal> listar();

    @Delete("DELETE FROM sucursal WHERE id=#{sucursal.id}")
    public void borrar(Sucursal sucursal);


    @Update("Update SUCURSAL SET #{sucursalvieja.id}= #{sucursalnueva.id}, " +
            "#{sucursalvieja.nombre}= #{sucursalnueva.nombre}," +
            "#{sucursalvieja.direccion}= #{sucursalnueva.direccion}," +
            "#{sucursalvieja.num}= #{sucursalnueva.num}," +
            "#{sucursalvieja.piso}= #{sucursalnueva.piso} " +
            "#{sucursalvieja.puerta}= #{sucursalnueva.puerta} " +
            "#{sucursalvieja.cod_postal}= #{sucursalnueva.cod_postal} " +
            "#{sucursalvieja.municipio}= #{sucursalnueva.municipio} " +
            "#{sucursalvieja.director}= #{sucursalnueva.director} " +
            "from SUCURSAL where id = #{sucursalvieja}")
    public void modificar(Sucursal sucursalvieja, Sucursal sucursalNueva);
}
