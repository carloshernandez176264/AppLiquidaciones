package com.AppLiquidaciones.AppLiquidaciones.infraestructure.driven_adapters.entity;


import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.Settlement;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table(name = "settlement")
@Builder
@Getter

public class SettlementDBO {

    private final Integer employee;

    private final String reasonSettlement;

    private final Double currentSalary;

    private final LocalDate contractStartDate;

    private final LocalDate contractEndDate;

    private final Double assistanceTransportation;

    private final Integer daysWorked;

    private final Integer daysWorkedCurrentYear;

    private final Integer daysVacations;

    private final Integer dayswokedLastSixMonths;

    private final Double baseSettlementSalary;

    private final Double severancePayment;

    private final Double interestSeverancePayment;

    private final Double vacationPay;

    private final Double bonusService;

    private final Double bonusUnjustiiedDissmisal;

    private final Double settlementTotal;



    public SettlementDBO(Integer employee, String reasonSettlement, Double currentSalary, LocalDate contractStartDate, LocalDate contractEndDate, Double assistanceTransportation,
                         Integer daysWorked, Integer daysWorkedCurrentYear, Integer daysVacations, Integer dayswokedLastSixMonths, Double baseSettlementSalary,
                         Double severancePayment, Double interestSeverancePayment, Double vacationPay, Double bonusService, Double bonusUnjustiiedDissmisal,
                         Double settlementTotal) {
        this.employee = employee;
        this.reasonSettlement = reasonSettlement;
        this.currentSalary = currentSalary;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.assistanceTransportation = assistanceTransportation;
        this.daysWorked = daysWorked;
        this.daysWorkedCurrentYear = daysWorkedCurrentYear;
        this.daysVacations = daysVacations;
        this.dayswokedLastSixMonths = dayswokedLastSixMonths;
        this.baseSettlementSalary = baseSettlementSalary;
        this.severancePayment = severancePayment;
        this.interestSeverancePayment = interestSeverancePayment;
        this.vacationPay = vacationPay;
        this.bonusService = bonusService;
        this.bonusUnjustiiedDissmisal = bonusUnjustiiedDissmisal;
        this.settlementTotal = settlementTotal;
    }

    public Integer getEmployee() {
        return employee;
    }

    public String getReasonSettlement() {
        return reasonSettlement;
    }

    public Double getCurrentSalary() {
        return currentSalary;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public Double getAssistanceTransportation() {
        return assistanceTransportation;
    }

    public Integer getDaysWorked() {
        return daysWorked;
    }

    public Integer getDaysWorkedCurrentYear() {
        return daysWorkedCurrentYear;
    }

    public Integer getDaysVacations() {
        return daysVacations;
    }

    public Integer getDayswokedLastSixMonths() {
        return dayswokedLastSixMonths;
    }

    public Double getBaseSettlementSalary() {
        return baseSettlementSalary;
    }

    public Double getSeverancePayment() {
        return severancePayment;
    }

    public Double getInterestSeverancePayment() {
        return interestSeverancePayment;
    }

    public Double getVacationPay() {
        return vacationPay;
    }

    public Double getBonusService() {
        return bonusService;
    }

    public Double getBonusUnjustiiedDissmisal() {
        return bonusUnjustiiedDissmisal;
    }

    public Double getSettlementTotal() {
        return settlementTotal;
    }
}
