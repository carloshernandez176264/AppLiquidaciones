package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.*;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.EmployeeRepository;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
@WebFluxTest(EmployeeHandler.class)
class EmployeeHandlerTest {

    @MockBean
    private EmployeeRepository employeeRepository;

    @Autowired
    private WebTestClient webTestClient;

//    @Test
//    @DisplayName("Create employee success")
//    void createEmployee() {
//        //Arrange
//        Employee employee = Employee.builder()
//                .id(1)
//                .name(new Name("Johan"))
//                .identification(new Identification(12345678))
//                .salary(new Salary(1500000.0))
//                .contractType(new ContractType("software developer"))
//                .contractStartDate(new ContractStartDate(LocalDate.of(2015,2,2)))
//                .contractEndDate(new ContractEndDate(LocalDate.of(2015,2,2)))
//                .area(new Area("software developer"))
//                .role(new Role("software developer"))
//                .photo(new Photo("photo"))
//                .build();
//        given(employeeRepository.save(employee)).willReturn(Mono.just(employee));
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