package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IEmployeeDBORepository extends ReactiveCrudRepository<Employee, Integer > {
}
