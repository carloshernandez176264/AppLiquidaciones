package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class IEmployeeDBORepositoryAdapter implements EmployeeRepository {


    @Override
    public Mono<Employee> save(Employee employee) {
        return Mono.just(employee);
    }

    @Override
    public Mono<Employee> findById(Integer id) {
        return null;
    }

    @Override
    public Mono<Employee> update(Employee employee) {
        return null;
    }

    @Override
    public Mono<Employee> delete(Integer id) {
        return null;
    }

    @Override
    public Flux<Employee> findAll() {
        return null;
    }
}
