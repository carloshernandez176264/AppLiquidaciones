package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters;

import com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.entity.IUserDBO;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDBORepository extends ReactiveCrudRepository<IUserDBO, Integer> {

}
