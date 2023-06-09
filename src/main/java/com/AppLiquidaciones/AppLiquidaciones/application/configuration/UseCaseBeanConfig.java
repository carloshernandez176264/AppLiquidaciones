package com.AppLiquidaciones.AppLiquidaciones.application.configuration;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.IEmployeeRepository;
import com.AppLiquidaciones.AppLiquidaciones.domain.usecase.EmployeeUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public EmployeeUseCase employeeUseCase(IEmployeeRepository iemployeeRepository) {
        return new EmployeeUseCase(iemployeeRepository);
    }
}
