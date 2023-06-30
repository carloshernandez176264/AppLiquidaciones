package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee;


import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class Employee {


    private ID id;
    private Name name;
    private Identification identification;
    private Salary salary;
    private ContractType contractType;
    private ContractStartDate contractStartDate;
    private ContractEndDate contractEndDate;
    private Area area;
    private Role role;
    private Photo photo;

    public Employee(ID id, Name name, Identification identification, Salary salary, ContractType contractType, ContractStartDate contractStartDate, ContractEndDate contractEndDate, Area area, Role role, Photo photo) {
        this.id = id;
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

    public Employee(Name name, Identification identification, Salary salary, ContractType contractType, ContractStartDate contractStartDate, ContractEndDate contractEndDate, Area area, Role role, Photo photo) {
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

    public ID getId() {
        return id;
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


    private void validateEmployee(Employee employee){
        if(employee == null){
            throw new IllegalArgumentException("please provide a valid employee");
        }
        if (getId() == null) {
            throw new IllegalArgumentException("please provide a valid id");
        }
        if(getId().equals(employee.getId())){
            throw new IllegalArgumentException("the employee if exists");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", identification=" + identification +
                ", salary=" + salary +
                ", contractType=" + contractType +
                ", contractStartDate=" + contractStartDate +
                ", contractEndDate=" + contractEndDate +
                ", area=" + area +
                ", role=" + role +
                ", photo=" + photo +
                '}';
    }
}

