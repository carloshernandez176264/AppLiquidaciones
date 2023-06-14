package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee;


import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class EmployeeHandler {

    private final EmployeeRepository employeeRepository;

    public Mono<ServerResponse> createEmployee(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(Employee.class)
                .flatMap(employeeRepository::save)
                .flatMap(savedEmployee -> ServerResponse
                        .status(HttpStatus.CREATED)
                        .bodyValue(savedEmployee))
                .onErrorResume(exception -> ServerResponse
                        .unprocessableEntity()
                        .bodyValue(exception.getMessage()));
    }

    public Mono<ServerResponse> queryEmployees(ServerRequest serverRequest) {
        return employeeRepository
                .findAll()
                .collectList()
                .flatMap(employees -> {
                    if (!employees.isEmpty()) {
                        return ServerResponse
                                .ok()
                                .bodyValue(employees);
                    } else {
                        return ServerResponse
                                .noContent()
                                .build();
                    }
                })
                .switchIfEmpty(ServerResponse
                                       .noContent()
                                       .build());
    }

    public Mono<ServerResponse> queryEmployeeById(ServerRequest serverRequest) {
        return employeeRepository
                .findById(Integer.valueOf(serverRequest.pathVariable("id")))
                .flatMap(employee -> ServerResponse
                        .ok()
                        .bodyValue(employee))
                .switchIfEmpty(ServerResponse
                                       .status(HttpStatus.NO_CONTENT)
                                       .bodyValue("Empleado no encontrado"));
    }

    public Mono<ServerResponse> updateEmployee(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(Employee.class)
                .flatMap(employeeRepository::update)
                .flatMap(savedEmployee -> ServerResponse
                        .ok()
                        .bodyValue(savedEmployee))
                .onErrorResume(exception -> ServerResponse
                        .unprocessableEntity()
                        .bodyValue("Error al actualizar empleado."));
    }

    public Mono<ServerResponse> deleteEmployee(ServerRequest serverRequest) {
        return employeeRepository
                .delete(Integer.valueOf(serverRequest.pathVariable("id")))
                .flatMap(deletedEmployee -> ServerResponse
                        .ok()
                        .bodyValue(deletedEmployee))
                .switchIfEmpty(ServerResponse
                                       .status(HttpStatus.NO_CONTENT)
                                       .bodyValue("Empleado no encontrado"));
    }





}
