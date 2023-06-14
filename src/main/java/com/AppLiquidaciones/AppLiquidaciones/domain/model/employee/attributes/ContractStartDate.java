package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

import java.util.Date;

@Builder
public class ContractStartDate {

    private Date value;

    public Date getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ContractStartDate{" +
                "value=" + value +
                '}';
    }
}
