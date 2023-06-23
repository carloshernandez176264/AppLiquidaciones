package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee;


import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.usecase.EmployeeUseCase;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
//@CrossOrigin(origins = {"http://localhost:4200"}, allowedHeaders = "*", allowCredentials = "true")
public class EmployeeHandler {

    private final EmployeeUseCase employeeUseCase;

    public Mono<ServerResponse> createEmployee(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(EmployeeDTO.class)
                .flatMap(employeeDTO -> employeeUseCase.createEmployee(employeeDTO)
                        .flatMap(savedEmployee -> ServerResponse
                                .status(HttpStatus.CREATED)
                                .bodyValue(savedEmployee)))
                .onErrorResume(exception -> ServerResponse
                        .badRequest()
                        .bodyValue("Error al crear el empleado. Error:  " + exception.getMessage()));
    }

    public Mono<ServerResponse> getEmployees(ServerRequest serverRequest) {
        return employeeUseCase
                .getEmployees()
                .collectList()
                .flatMap(employees -> ServerResponse
                        .ok()
                        .bodyValue(employees))
                .switchIfEmpty(ServerResponse
                                       .status(HttpStatus.NO_CONTENT)
                                       .bodyValue("No hay empleados registrados"));
    }

    public Mono<ServerResponse> getEmployeeById(ServerRequest serverRequest) {
        System.out.println("Entrando a getEmployeeById");
        return employeeUseCase
                .getEmployeeById(Integer.valueOf(serverRequest.pathVariable("id")))
                .flatMap(employee -> ServerResponse
                        .ok()
                        .bodyValue(EmployeeDTO.fromDomain(employee)))
                .onErrorResume(exception -> ServerResponse
                        .status(HttpStatus.NOT_FOUND)
                        .bodyValue("Error al obtener el empleado. Error:  " + exception.getMessage()));
    }

    public Mono<ServerResponse> updateEmployee(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(EmployeeDTO.class)
                .flatMap(employeeDTO -> employeeUseCase
                        .updateEmployee(employeeDTO)
                        .flatMap(savedEmployee -> ServerResponse
                                .status(HttpStatus.CREATED)
                                .bodyValue(EmployeeDTO.fromDomain(savedEmployee))))
                .onErrorResume(exception -> ServerResponse
                        .badRequest()
                        .bodyValue(exception.getMessage()));
    }


    public Mono<ServerResponse> deleteEmployee(ServerRequest serverRequest) {
        Integer id = Integer.valueOf(serverRequest.pathVariable("id"));
        return employeeUseCase
                .deleteEmployee(id)
                .flatMap(employee -> ServerResponse
                        .ok()
                        .bodyValue(employee))
                .switchIfEmpty(ServerResponse
                                       .notFound()
                                       .build());}






}
