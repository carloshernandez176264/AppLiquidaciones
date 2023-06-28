package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.constants;


import lombok.Builder;

@Builder
public class SettlementConstants {

    //parameters for liquidation of justified withdrawal

    private static final double salaryMin = 1160000;


    public static final Double salaryMax = 2320000D;

    private static final Integer paymentOfVacationsForYear = 15;

    private static final double paymentOfVacationsForMonth = 1.25;

    private static final double paymentOfVacationsForDay = 0.0416;

    private static final Integer daysWorkedForMonth = 30;

    private static final Integer daysWorkedForSemester = 180;

    private static final Integer daysWorkedForYear = 360;

    private static final double assistanceTransportation = 102854D;

    private static final boolean isAssistanceTransportation = true;

    //parameters for liquidation of justified withdrawal

    private static final double bonus = 0.0;


}
