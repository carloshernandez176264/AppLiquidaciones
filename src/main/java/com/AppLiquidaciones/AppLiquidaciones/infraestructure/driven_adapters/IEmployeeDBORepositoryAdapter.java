package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.EmployeeRepository;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.entity.EmployeeDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class IEmployeeDBORepositoryAdapter implements EmployeeRepository {

    private final IEmployeeDBORepository repository;

    @Override
    public Mono<Employee> save(Employee employee) {
        return repository.save(EmployeeDBO.fromDomain(employee)).map(EmployeeDBO::toDomain);

    }


    @Override
    public Mono<Employee> findById(Integer id) {
        return repository.findById(id).map(EmployeeDBO::toDomain);

    }

    @Override
    public Mono<Employee> update(Employee employee) {
        EmployeeDBO employeeDBO = EmployeeDBO.fromDomain(employee);
        return repository.save(employeeDBO).map(EmployeeDBO::toDomain);


    }

    @Override
    public Mono<Employee> delete(Integer id) {
        return repository.findById(id)
                .flatMap(employee -> repository.delete(employee)
                        .then(Mono.just(employee.toDomain())));
    }

    @Override
    public Flux<Employee> findAll() {
        return repository.findAll().map(EmployeeDBO::toDomain);
    }
}
