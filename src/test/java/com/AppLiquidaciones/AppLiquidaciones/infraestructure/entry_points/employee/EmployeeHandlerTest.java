package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.*;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.EmployeeRepository;
import com.AppLiquidaciones.AppLiquidaciones.domain.usecase.EmployeeUseCase;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.DBORepositorys.IEmployeeDBORepository;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.ApiRoutes;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee.dto.EmployeeDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;


/*@ExtendWith(SpringExtension.class)
@WebFluxTest(EmployeeHandler.class)*/
@ContextConfiguration(classes = {EmployeeHandler.class, ApiRoutes.class})
@WebFluxTest(EmployeeHandler.class)
class EmployeeHandlerTest {

    @MockBean
    private EmployeeUseCase employeeUseCase;

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void serializeTest(){
        Employee employee = new Employee(
                new ID(15),
                new Name("prueba"),
                new Identification(32589621),
                new Salary(1800000D),
                new ContractType("prueba"),
                new ContractStartDate(LocalDate.of(2015, 01, 01)),
                new ContractEndDate(LocalDate.of(2015, 01, 16)),
                new Area("prueba"),
                new Role("desarrollador de software"),
                new Photo("prueba"));
        EmployeeDTO employeeDTO = EmployeeDTO.fromDomain(employee);
        Employee employee1 =  employeeDTO.toDomain();
        System.out.println(employee1.toString());
        assertEquals(employee, employee1);
    }


    @Test
    @DisplayName("Create employee success")
    void createEmployee() {
        //Arrange
        Employee employee = new Employee(
                new ID(15),
                new Name("prueba"),
                new Identification(32589621),
                new Salary(1800000D),
                new ContractType("prueba"),
                new ContractStartDate(LocalDate.of(2015, 01, 01)),
                new ContractEndDate(LocalDate.of(2015, 01, 16)),
                new Area("prueba"),
                new Role("desarrollador de software"),
                new Photo("prueba"));

        given(employeeUseCase.createEmployee(EmployeeDTO.fromDomain(employee))).willReturn(Mono.just(employee));

        //Act & Asseert
        webTestClient
                .post()
                .uri("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(EmployeeDTO.class)
                .exchange()
                .expectStatus()
                .isCreated()
                .expectBody(Employee.class)
                .isEqualTo(employee);
    }

    @Test
    @DisplayName("Create employee error")
    void createEmployeeError() {
        //Arrange
        Employee employee = new Employee(
                new ID(15),
                new Name("prueba"),
                new Identification(32589621),
                new Salary(1800000D),
                new ContractType("prueba"),
                new ContractStartDate(LocalDate.of(2015, 01, 01)),
                new ContractEndDate(LocalDate.of(2015, 01, 16)),
                new Area("prueba"),
                new Role("desarrollador de software"),
                new Photo("prueba"));

        given(employeeUseCase.createEmployee(EmployeeDTO.fromDomain(employee))).willReturn(Mono.just(employee));

        //Act & Asseert
        webTestClient
                .post()
                .uri("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(EmployeeDTO.class)
                .exchange()
                .expectStatus()
                .isCreated()
                .expectBody(Employee.class)
                .isEqualTo(employee);
    }



    @Test
    void getEmployees() {
    }

    @Test
    void getEmployeeById() {

    }

    @Test
    void updateEmployee() {
    }

    @Test
    void deleteEmployee() {
    }
}