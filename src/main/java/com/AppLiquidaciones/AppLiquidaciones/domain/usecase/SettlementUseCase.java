package com.AppLiquidaciones.AppLiquidaciones.domain.usecase;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.gateways.SettlementRepository;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.AssistanceTransportation;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributesReason.ReasonContractEnd;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributesReason.attributesReasonContractEnd.UnjustifiedContractEnd;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class SettlementUseCase {

    private final SettlementRepository settlementRepository;

    private final Employee employee;

    private final ReasonContractEnd reasonContractEnd;


    private Integer daysWorked() {
        return employee.getContractEndDate().getValue().getDayOfYear() - employee.getContractStartDate().getValue().getDayOfYear();
    }

    private AssistanceTransportation assistanceTransportation(Double currentSalary) {
        return new AssistanceTransportation(currentSalary >= 2320000 ? 102854D : 0);
    }
    private Double calculatedBonusService(Double currentSalary, Integer daysWorked) {
        return currentSalary * daysWorked / 360;
    }

    private Double calculatedLayOff(Double currentSalary, Integer daysWorked) {
        return currentSalary * daysWorked / 360;
    }

    private Double calculatedInterestLayOff(Double currentSalary, Integer daysWorked) {
        return currentSalary * daysWorked * 0.12 / 360;
    }

    private Double calculatedVacations(Double currentSalary, Integer daysWorked) {
        return currentSalary * daysWorked / 720;
    }

    private ReasonContractEnd UnjustifiedContractEnd = new ReasonContractEnd("UnjustifiedContractEnd");

    private Double calculatedBonusUnjustifiedContractEnd(Double salary, LocalDate contractStartDate) {
        return salary * (LocalDate.now().getYear() - contractStartDate.getYear());
    }


    public void calculateSettlement() {
        Integer daysWorked = daysWorked();
        Double Salary = employee.getSalary().getValue();
        AssistanceTransportation assistanceTransportation = assistanceTransportation(Salary);
        Double calculatedBonusService = calculatedBonusService(Salary, daysWorked);
        Double calculatedLayOff = calculatedLayOff(Salary, daysWorked);
        Double calculatedInterestLayOff = calculatedInterestLayOff(Salary, daysWorked);
        Double calculatedVacations = calculatedVacations(Salary, daysWorked);
        boolean ReasonContractEnd = reasonContractEnd.equals(UnjustifiedContractEnd);
        if (reasonContractEnd.equals(UnjustifiedContractEnd)) {
            Double calculatedBonusUnjustifiedContractEnd = calculatedBonusUnjustifiedContractEnd(Salary, employee.getContractStartDate().getValue());
            settlementRepository.save(employee, assistanceTransportation, calculatedBonusService, calculatedLayOff, calculatedInterestLayOff, calculatedVacations,
                    calculatedBonusUnjustifiedContractEnd);
        }
    }

}


