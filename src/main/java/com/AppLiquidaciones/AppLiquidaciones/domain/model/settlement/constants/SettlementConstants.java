package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.constants;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.Salary;
import lombok.Builder;

@Builder
public class SettlementConstants {

    //parameters for liquidation of justified withdrawal

    private static final double paymentOfVacationsForYear = 15D;

    private static final double paymentOfVacationsForMonth = 1.25;

    private static final double paymentOfVacationsForDay = 0.0416;

    private static final double daysWorkedForMonth = 30D;

    private static final double daysWorkedForSemester = 180D;

    private static final double daysWorkedForYear = 360D;

    private static final double assistanceTransportation = 102854D;

    //parameters for liquidation of justified withdrawal

    private static final double bonus = 0.0;




}
