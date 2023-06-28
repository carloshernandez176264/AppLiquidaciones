package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;


import lombok.Builder;

@Builder
public class ID {
    private final Integer value;

    public ID(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
