package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes;

public class InterestSeverancePayment {

    private final Double value;

    public InterestSeverancePayment(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
