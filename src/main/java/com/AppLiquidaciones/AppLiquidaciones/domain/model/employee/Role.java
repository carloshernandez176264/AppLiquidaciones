package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee;

import lombok.Builder;

@Builder
public class Role {

    private String value;

    public String getValue() {
        return value;
    }

}
