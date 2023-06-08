package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee;

public class Employee {

    private Integer id;
    private Name name;
    private Identification identification;
    private Salary salary;
    private ContractType contractType;
    private ContractStartDate contractStartDate;
    private Position position;

    public Employee(Name name, Identification identification, Salary salary, ContractType contractType, ContractStartDate contractStartDate, Position position) {
        this.name = name;
        this.identification = identification;
        this.salary = salary;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.position = position;
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
