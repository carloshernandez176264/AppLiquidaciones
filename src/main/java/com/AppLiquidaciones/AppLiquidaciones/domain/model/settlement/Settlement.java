package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.ContractEndDate;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.ContractStartDate;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.Salary;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.*;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributesReason.ReasonSettlement;
import lombok.Builder;

@Builder
public class Settlement {

    private final Employee employee;

    private final ReasonSettlement reasonSettlement;

    private final Salary currentSalary;

    private final ContractStartDate contractStartDate;

    private final ContractEndDate contractEndDate;

    private final AssistanceTransportation assistanceTransportation;

    private final DaysWorked daysWorked;

    private final DaysWorkedCurrentYear daysWorkedCurrentYear;

    private final DaysVacations daysVacations;

    private final DayswokedLastSixMonths dayswokedLastSixMonths;

    private final BaseSettlementSalary baseSettlementSalary;

    private final SeverancePayment severancePayment;

    private final InterestSeverancePayment interestSeverancePayment;

    private final VacationPay vacationPay;

    private final BonusService bonusService;

    private final BonusUnjustiiedDissmisal bonusUnjustiiedDissmisal;

    private final SettlementTotal settlementTotal;

    public Settlement(Employee employee, ReasonSettlement reasonSettlement, Salary currentSalary, ContractStartDate contractStartDate,
                      ContractEndDate contractEndDate, AssistanceTransportation assistanceTransportation, DaysWorked daysWorked,
                      DaysWorkedCurrentYear daysWorkedCurrentYear, DaysVacations daysVacations, DayswokedLastSixMonths dayswokedLastSixMonths,
                      BaseSettlementSalary baseSettlementSalary, SeverancePayment severancePayment, InterestSeverancePayment interestSeverancePayment,
                      VacationPay vacationPay, BonusService bonusService, BonusUnjustiiedDissmisal bonusUnjustiiedDissmisal,
                      SettlementTotal settlementTotal) {
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

    public Employee getEmployee() {
        return employee;
    }

    public ReasonSettlement getReasonSettlement() {
        return reasonSettlement;
    }

    public Salary getCurrentSalary() {
        return currentSalary;
    }

    public ContractStartDate getContractStartDate() {
        return contractStartDate;
    }

    public ContractEndDate getContractEndDate() {
        return contractEndDate;
    }

    public AssistanceTransportation getAssistanceTransportation() {
        return assistanceTransportation;
    }

    public DaysWorked getDaysWorked() {
        return daysWorked;
    }

    public DaysWorkedCurrentYear getDaysWorkedCurrentYear() {
        return daysWorkedCurrentYear;
    }

    public DaysVacations getDaysVacations() {
        return daysVacations;
    }

    public DayswokedLastSixMonths getDayswokedLastSixMonths() {
        return dayswokedLastSixMonths;
    }

    public BaseSettlementSalary getBaseSettlementSalary() {
        return baseSettlementSalary;
    }

    public SeverancePayment getSeverancePayment() {
        return severancePayment;
    }

    public InterestSeverancePayment getInterestSeverancePayment() {
        return interestSeverancePayment;
    }

    public VacationPay getVacationPay() {
        return vacationPay;
    }

    public BonusService getBonusService() {
        return bonusService;
    }

    public BonusUnjustiiedDissmisal getBonusUnjustiiedDissmisal() {
        return bonusUnjustiiedDissmisal;
    }

    public SettlementTotal getSettlementTotal() {
        return settlementTotal;
    }
}
