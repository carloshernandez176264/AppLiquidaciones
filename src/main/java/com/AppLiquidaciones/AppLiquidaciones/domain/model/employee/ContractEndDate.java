package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee;

import lombok.Builder;

import java.util.Date;

@Builder
public class ContractEndDate {

    private Date value;

    public Date getValue() {
        return value;
    }
}
