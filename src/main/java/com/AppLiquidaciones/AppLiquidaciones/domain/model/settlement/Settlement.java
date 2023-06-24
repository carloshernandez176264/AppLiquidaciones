package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.Employee;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.ContractEndDate;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.ContractStartDate;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.Salary;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.AssistanceTransportation;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.DaysWorked;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.DaysWorkedCurrentYear;
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

    private final DaysVacations








}
