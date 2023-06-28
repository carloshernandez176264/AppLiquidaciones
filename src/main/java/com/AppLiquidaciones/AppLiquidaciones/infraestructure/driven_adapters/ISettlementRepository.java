package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters;

import com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.entity.SettlementDBO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISettlementRepository extends ReactiveCrudRepository<SettlementDBO, Integer > {
}
