package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes;

public class SeverancePayment {

    private final Double value;

    public SeverancePayment(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
