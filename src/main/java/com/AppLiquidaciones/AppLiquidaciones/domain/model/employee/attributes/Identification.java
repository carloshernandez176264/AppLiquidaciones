package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

@Builder
public class Identification {

    private Integer value;

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Identification{" +
                "value=" + value +
                '}';
    }
}
