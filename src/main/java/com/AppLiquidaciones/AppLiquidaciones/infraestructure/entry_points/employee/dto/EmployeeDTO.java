package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee.dto;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.*;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.*;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;


public class EmployeeDTO {

    @Id
    private Integer id;
    private String name;
    private Integer identification;
    private Double salary;
    private String contractType;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private String area;
    private String role;
    private String photo;

    public Employee toDomain() {
        return new Employee(ID.builder().value(id).build(), Name.builder().value(name).build(),
                Identification.builder().value(identification).build(), Salary.builder().value(salary).build(), ContractType.builder().value(contractType).build(),
                ContractStartDate.builder().value(contractStartDate).build(), ContractEndDate.builder().value(contractEndDate).build(),
                Area.builder().value(area).build(), Role.builder().value(role).build(), Photo.builder().value(photo).build());
    }

    public static EmployeeDTO fromDomain(Employee employee) {
        return new EmployeeDTO(employee.getName().getValue(), employee.getIdentification().getValue(), employee.getSalary().getValue(),
                employee.getContractType().getValue(), employee.getContractStartDate().getValue(), employee.getContractEndDate().getValue(),
                employee.getArea().getValue(), employee.getRole().getValue(), employee.getPhoto().getValue());
    }

    public EmployeeDTO(String name, Integer identification, Double salary, String contractType, LocalDate contractStartDate, LocalDate contractEndDate, String area, String role, String photo) {
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

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getContractType() {
        return contractType;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public Integer getIdentification() {
        return identification;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public String getArea() {
        return area;
    }

    public String getRole() {
        return role;
    }

    public String getPhoto() {
        return photo;
    }
}
