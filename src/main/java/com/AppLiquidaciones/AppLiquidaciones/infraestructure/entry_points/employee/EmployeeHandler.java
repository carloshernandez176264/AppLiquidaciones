package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee;


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
@CrossOrigin(origins = "*")
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
                        .bodyValue("Error al crear el empleado. Error:  " + exception.getCause()));
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

//        return ServerResponse.ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(employeeUseCase.getEmployees()
//                        .map(employee -> EmployeeDTO.fromDomain(employee)), EmployeeDTO.class);
    }

    public Mono<ServerResponse> getEmployeeById(ServerRequest serverRequest) {
        System.out.println("Entrando a getEmployeeById");
        int id = Integer.parseInt(serverRequest.pathVariable("id"));
        return employeeUseCase
                .getEmployeeById(id)
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
                        .flatMap(updateEmployee -> ServerResponse
                                .status(HttpStatus.CREATED)
                                .bodyValue(EmployeeDTO.fromDomain(updateEmployee))))
                .onErrorResume(exception -> ServerResponse
                        .badRequest()
                        .bodyValue(exception.getMessage()));
    }


    public Mono<ServerResponse> deleteEmployee(ServerRequest serverRequest) {
        int id = Integer.parseInt(serverRequest.pathVariable("id"));
        return employeeUseCase
                .deleteEmployee(id)
                .flatMap(employee -> ServerResponse
                        .ok()
                        .bodyValue(employee))
                .switchIfEmpty(ServerResponse
                                       .notFound()
                                       .build());}
}
