package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.config;

import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;


@Configuration
@EnableR2dbcRepositories
public class DbConfig extends AbstractR2dbcConfiguration {



    @Override
    @Bean
    public ConnectionFactory connectionFactory() {
        return new PostgresqlConnectionFactory(PostgresqlConnectionConfiguration
                .builder()
                .host("localhost")
                .port(5432)
                .database("AppLiqui")
                .username("postgres")
                .password("Edilma5422*")
                .build());
    }

}
