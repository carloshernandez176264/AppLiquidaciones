package com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points;

import com.AppLiquidaciones.AppLiquidaciones.infraestructure.entry_points.employee.EmployeeHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
@CrossOrigin(origins = "*")
public class ApiRoutes {

    @Value("${PATH_BASE}")
    private String pathBase;

    @Bean
    public RouterFunction<ServerResponse> employeeFunctionalEndpoints(EmployeeHandler handler) {
        String param = "/{id}";
        return RouterFunctions
                .route(POST(pathBase).and(accept(MediaType.APPLICATION_JSON)), handler::createEmployee)
                .andRoute(GET(pathBase).and(accept(MediaType.APPLICATION_JSON)), handler::getEmployees)
                .andRoute(GET(pathBase.concat(param)).and(accept(MediaType.APPLICATION_JSON)), handler::getEmployeeById)
                .andRoute(PUT(pathBase.concat(param)).and(accept(MediaType.APPLICATION_JSON)), handler::updateEmployee)
                .andRoute(DELETE(pathBase.concat(param)).and(accept(MediaType.APPLICATION_JSON)),
                          handler::deleteEmployee);
    }

    @Bean
    CorsWebFilter corsFilter() {

        CorsConfiguration config = new CorsConfiguration();

        // Possibly...
        // config.applyPermitDefaultValues()

        config.setAllowCredentials(true);
        config.addAllowedOrigin("http://localhost:4200");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsWebFilter(source);
    }

}
