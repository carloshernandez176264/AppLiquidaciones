package com.AppLiquidaciones.AppLiquidaciones.application.configuration;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.EmployeeRepository;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.SettlementRepository;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.UserRepository;
import com.AppLiquidaciones.AppLiquidaciones.domain.usecase.EmployeeUseCase;
import com.AppLiquidaciones.AppLiquidaciones.domain.usecase.SettlementUseCase;
import com.AppLiquidaciones.AppLiquidaciones.domain.usecase.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean
    public EmployeeUseCase employeeUseCase(EmployeeRepository employeeRepository) {

        return new EmployeeUseCase(employeeRepository);
    }

    @Bean
    public UserUseCase userUseCase(UserRepository userRepository) {

        return new UserUseCase(userRepository);
    }

}
