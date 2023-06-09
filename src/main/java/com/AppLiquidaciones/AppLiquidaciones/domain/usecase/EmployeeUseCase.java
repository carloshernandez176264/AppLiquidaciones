package com.AppLiquidaciones.AppLiquidaciones.domain.usecase;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.EmployeeRepository;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee.dto.EmployeeDTO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeUseCase {

    private final EmployeeRepository employeeRepository;

    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeDTO.toDomain();
        employeeRepository.save(employee);
        return employeeDTO;
    }

    public void updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeDTO.toDomain();
        employeeRepository.update(employee);
    }

    public void getAllEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeDTO.toDomain();
        employeeRepository.findAll();
    }




}
