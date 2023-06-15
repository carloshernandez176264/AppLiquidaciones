package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.entity;


import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.*;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;



@Table(name = "employees")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDBO {

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

    public static EmployeeDBO fromDomain(Employee employee) {
        System.out.println(employee.toString());
        return EmployeeDBO.builder()
                .name(employee.getName().getValue())
                .identification(employee.getIdentification().getValue())
                .salary(employee.getSalary().getValue())
                .contracttype(employee.getContracttype().getValue())
                .contractStartDate(employee.getContractStartDate().getValue())
                .contractEndDate(employee.getContractEndDate().getValue())
                .area(employee.getArea().getValue())
                .role(employee.getRole().getValue())
                .photo(employee.getPhoto().getValue())
                .build();
    }

    public Employee toDomain() {
        return new Employee(Name.builder().value(name).build(), Identification.builder().value(identification).build(),
                Salary.builder().value(salary).build(),ContractType.builder().value(contracttype).build() , ContractStartDate.builder().value(contractStartDate).build(),
                ContractEndDate.builder().value(contractEndDate).build(), Area.builder().value(area).build(), Role.builder().value(role).build(),
                Photo.builder().value(photo).build() );
    }

    public String getName() {
        return name;
    }

    public Integer getIdentification() {
        return identification;
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
