package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee;

import lombok.Builder;

@Builder
public class ContractType {

    private String value;

    public String getValue() {
        return value;
    }
}
