package com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.Salary;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UpdateSalaryRepository {

    Mono<Salary> updateSalary(Salary salary);

    Flux<Salary> findSalaries(Flux<Salary> salaries);


}
