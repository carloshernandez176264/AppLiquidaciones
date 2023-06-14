package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee;

import lombok.Builder;

@Builder
public class Name {

    private String value;

    public String getValue() {
        return value;
    }
}
