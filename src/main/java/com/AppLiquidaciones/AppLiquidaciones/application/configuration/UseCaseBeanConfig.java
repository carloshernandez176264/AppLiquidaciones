package com.AppLiquidaciones.AppLiquidaciones.application.configuration;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.EmployeeRepository;
import com.AppLiquidaciones.AppLiquidaciones.domain.usecase.EmployeeUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public EmployeeUseCase employeeUseCase(EmployeeRepository employeeRepository) {

        return new EmployeeUseCase(employeeRepository);
    }

}
