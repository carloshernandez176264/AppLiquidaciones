package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DbSecret {

        private String username;
        private String password;
        private String host;
        private Integer port;
        private String database;
}
