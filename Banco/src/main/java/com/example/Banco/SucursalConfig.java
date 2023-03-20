package com.example.Banco;

import com.example.Banco.controllers.SucursalController;
import org.springframework.context.annotation.Bean;

public class SucursalConfig {

    @Bean
    public SucursalController sucursalService() {
        return new SucursalController();
    }
}
