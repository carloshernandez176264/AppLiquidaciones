package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee;

import lombok.Builder;

@Builder
public class Salary {

    private Integer value;

    public Salary(Integer value) {
        this.value = value;
    }
}
