package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee;


import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.*;
import org.springframework.data.annotation.Id;

public class Employee {

    @Id
    private Integer id;
    private Name name;
    private Identification identification;
    private Salary salary;
    private ContractType contracttype;
    private ContractStartDate contractStartDate;
    private ContractEndDate contractEndDate;
    private Area area;
    private Role role;
    private Photo photo;

    public Employee(Name name, Identification identification, Salary salary, ContractType contracttype,
                    ContractStartDate contractStartDate, ContractEndDate contractEndDate,Area area, Role role, Photo photo) {
        this.name = name;
        this.identification = identification;
        this.salary = salary;
        this.contracttype = contracttype;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.area = area;
        this.role = role;
        this.photo = photo;
    }

    public Name getName() {
        return name;
    }

    public Identification getIdentification() {
        return identification;
    }

    public Salary getSalary() {
        return salary;
    }

    public ContractType getContracttype() {
        return contracttype;
    }

    public ContractStartDate getContractStartDate() {
        return contractStartDate;
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
