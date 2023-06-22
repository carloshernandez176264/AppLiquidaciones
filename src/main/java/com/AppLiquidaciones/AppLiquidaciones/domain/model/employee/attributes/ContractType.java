package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

@Builder
public class ContractType {

    private String value;

    public ContractType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ContractType{" +
                "value='" + value + '\'' +
                '}';
    }
}
