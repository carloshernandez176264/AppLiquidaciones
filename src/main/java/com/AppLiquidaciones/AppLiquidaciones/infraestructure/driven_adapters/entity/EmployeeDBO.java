package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.entity;


import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table(name = "employees")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDBO {

    @Id
    private Integer id;
    private String name;
    private Identification identification;
    private Salary salary;
    private ContractType contractType;
    private ContractStartDate contractStartDate;
    private ContractEndDate contractEndDate;
    private Area area;
    private Role role;
    private Photo photo;

    public static EmployeeDBO fromDomain(Employee employee) {
        return EmployeeDBO.builder()
                .name(employee.getName().getValue())
                .identification(employee.getIdentification())
                .salary(employee.getSalary())
                .contractType(employee.getContractType())
                .contractStartDate(employee.getContractStartDate())
                .contractEndDate(employee.getContractEndDate())
                .area(employee.getArea())
                .role(employee.getRole())
                .photo(employee.getPhoto())
                .build();
    }

    public Employee toDomain() {
        return new Employee(Name.builder().value(name).build(), identification, salary, contractType, contractStartDate, contractEndDate, area, role, photo);
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
}
