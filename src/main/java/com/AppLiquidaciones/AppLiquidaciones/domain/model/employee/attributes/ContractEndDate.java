package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

import java.util.Date;

@Builder
public class ContractEndDate {

    private Date value;

    public Date getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ContractEndDate{" +
                "value=" + value +
                '}';
    }
}
