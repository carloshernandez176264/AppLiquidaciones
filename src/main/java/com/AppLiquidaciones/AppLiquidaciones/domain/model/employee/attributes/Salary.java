package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

@Builder
public class Salary {

    private Integer value;

    public Salary(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "value=" + value +
                '}';
    }
}
