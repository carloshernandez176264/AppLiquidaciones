package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee.dto;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.*;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;

public class EmployeeDTO {

    @Id
    private Integer id;
    private String name;
    private Integer identification;
    private Integer salary;
    private String contracttype;
    private LocalDate contractStartDate;
    private LocalDate contractEndDate;
    private String area;
    private String role;
    private String photo;

    public Employee toDomain(){
        return new Employee(Name.builder().value(name).build(),
                Identification.builder().value(identification).build(), Salary.builder().value(salary).build(), ContractType.builder().value(contracttype).build(),
                ContractStartDate.builder().value(contractStartDate).build(), ContractEndDate.builder().value(contractEndDate).build(),
                Area.builder().value(area).build(), Role.builder().value(role).build(), Photo.builder().value(photo).build());
    }

    public static EmployeeDTO fromDomain(Employee employee) {
        return new EmployeeDTO(employee.getName().getValue(), employee.getIdentification().getValue(), employee.getSalary().getValue(),
                employee.getContracttype().getValue(), employee.getContractStartDate().getValue(), employee.getContractEndDate().getValue(),
                employee.getArea().getValue(), employee.getRole().getValue(), employee.getPhoto().getValue());
    }

    public EmployeeDTO(String name, Integer identification, Integer salary, String contracttype, LocalDate contractStartDate, LocalDate contractEndDate, String area, String role, String photo) {
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

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getContracttype() {
        return contracttype;
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
