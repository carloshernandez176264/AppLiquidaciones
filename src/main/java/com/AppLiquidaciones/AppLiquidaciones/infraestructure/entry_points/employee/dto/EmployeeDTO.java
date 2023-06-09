package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee.dto;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.*;

public class EmployeeDTO {

    private Integer id;
    private Name name;
    private Identification identification;
    private Salary salary;
    private ContractType contractType;
    private ContractStartDate contractStartDate;
    private Position position;

    public Employee toDomain() {
        return new Employee(name, identification, salary, contractType, contractStartDate, position);
    }

    public static EmployeeDTO fromDomain(Employee employee) {
        return new EmployeeDTO(employee.getName(), employee.getSalary(), employee.getContractType(), employee.getContractStartDate(), employee.getPosition());
    }

    public EmployeeDTO(Name name, Salary salary, ContractType contractType, ContractStartDate contractStartDate, Position position) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.position = position;
    }

    public Name getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Salary getSalary() {
        return salary;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public ContractStartDate getContractStartDate() {
        return contractStartDate;
    }

    public Position getPosition() {
        return position;
    }
}
