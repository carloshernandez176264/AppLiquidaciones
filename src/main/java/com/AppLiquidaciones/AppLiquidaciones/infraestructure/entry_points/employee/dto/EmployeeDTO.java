package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee.dto;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.*;

public class EmployeeDTO {

    private Integer id;
    private Name name;
    private Identification identification;
    private Salary salary;
    private ContractType contractType;
    private ContractStartDate contractStartDate;
    private ContractEndDate contractEndDate;
    private Area area;
    private Role role;
    private Photo photo;

    public Employee toDomain() {
        return new Employee(name, identification, salary, contractType, contractStartDate, contractEndDate, area, role, photo);
    }

    public static EmployeeDTO fromDomain(Employee employee) {
        return new EmployeeDTO(employee.getName(), employee.getIdentification(), employee.getSalary(), employee.getContractType(),
                employee.getContractStartDate(), employee.getContractEndDate(),employee.getArea(), employee.getRole(), employee.getPhoto());
    }

    public EmployeeDTO(Name name, Identification identification, Salary salary, ContractType contractType,
                       ContractStartDate contractStartDate, ContractEndDate contractEndDate,Area area, Role role, Photo photo) {
        this.name = name;
        this.identification = identification;
        this.salary = salary;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.area = area;
        this.role = role;
        this.photo = photo;
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

    public Identification getIdentification() {
        return identification;
    }

    public ContractEndDate getContractEndDate() {
        return contractEndDate;
    }

    public Area getArea() {
        return area;
    }

    public Role getRole() {
        return role;
    }

    public Photo getPhoto() {
        return photo;
    }
}
