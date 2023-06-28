package com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.Settlement;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.AssistanceTransportation;
import reactor.core.publisher.Mono;

public interface SettlementRepository {

  Mono<Settlement> save(Settlement settlement);


  Mono liquidateSettlement( );

  Mono save(Employee employee, AssistanceTransportation assistanceTransportation, Double calculatedBonusService, Double calculatedLayOff, Double calculatedInterestLayOff,
            Double calculatedVacations, Double calculatedBonusUnjustifiedContractEnd);
}
