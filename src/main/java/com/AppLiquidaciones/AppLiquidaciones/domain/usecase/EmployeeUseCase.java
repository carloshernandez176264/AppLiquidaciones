package com.AppLiquidaciones.AppLiquidaciones.domain.usecase;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.EmployeeRepository;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class EmployeeUseCase {

    private final EmployeeRepository employeeRepository;

    public Mono<Employee> createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeDTO.toDomain();
        return employeeRepository.save(employee);
    }

    public Flux<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Mono<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }

    public Mono<Employee> updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeDTO.toDomain();
        return employeeRepository.update(employee);
    }

    public Mono<Employee> deleteEmployee(Integer id) {
        return employeeRepository.delete(id);
    }


}
