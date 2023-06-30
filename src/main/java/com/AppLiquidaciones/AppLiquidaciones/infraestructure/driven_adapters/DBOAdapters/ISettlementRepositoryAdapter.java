package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.DBOAdapters;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.SettlementRepository;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.Settlement;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.AssistanceTransportation;
import com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.DBORepositorys.ISettlementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class ISettlementRepositoryAdapter implements SettlementRepository {

    private final ISettlementRepository repository;

    @Override
    public Mono<Settlement> save(Settlement settlement) {
        return null;
    }

    @Override
    public Mono liquidateSettlement() {
        return null;
    }

    @Override
    public Mono save(Employee employee, AssistanceTransportation assistanceTransportation, Double calculatedBonusService, Double calculatedLayOff, Double calculatedInterestLayOff,
                     Double calculatedVacations, Double calculatedBonusUnjustifiedContractEnd) {
        return  null;
    }
}
