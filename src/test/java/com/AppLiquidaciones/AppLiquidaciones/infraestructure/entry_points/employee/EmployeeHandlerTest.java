package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.*;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.IEmployeeDBORepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

import static org.mockito.BDDMockito.given;


@ExtendWith(SpringExtension.class)
@WebFluxTest(EmployeeHandler.class)
class EmployeeHandlerTest {

    @MockBean
    private IEmployeeDBORepository employeeDBORepository;

    @Autowired
    private WebTestClient webTestClient;

//    @Test
//    @DisplayName("Create employee success")
//    void createEmployee() {
//        //Arrange
//        Employee employee = new Employee(
//                new ID(1),
//                new Name("prueba"),
//                new Identification(32589621),
//                new Salary(1800000D),
//                new ContractType("prueba"),
//                new ContractStartDate(LocalDate.of(2015, 01, 01)),
//                new ContractEndDate(LocalDate.of(2015, 01, 16)),
//                new Area("prueba"),
//                new Role("prueba"),
//                new Photo("prueba"));
//
//        given(employeeDBORepository.save(employeeDBO)).willReturn(Mono.just(employee));
//
//        //Act & Asseert
//webTestClient.post()
//                .uri("/employee")
//        .contentType(MediaType.APPLICATION_JSON)
//        .bodyValue(employee)
//        .exchange()
//        .expectStatus()
//        .isCreated()
//        .expectBody(Employee.class)
//        .isEqualTo(employee);
//
//    }

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