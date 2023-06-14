package com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeRepository {

    Mono<Employee> save(Employee employee);

    Mono<Employee> findById(Integer id);

    Mono<Employee> update(Employee employee);

    Mono<Employee> delete(Integer id);

    Flux<Employee> findAll();


}
