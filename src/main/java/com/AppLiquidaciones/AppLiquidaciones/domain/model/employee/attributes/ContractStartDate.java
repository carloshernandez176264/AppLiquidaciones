package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

import java.time.LocalDate;
import java.util.Date;

@Builder
public class ContractStartDate {

    private LocalDate value;

    public LocalDate getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ContractStartDate{" +
                "value=" + value +
                '}';
    }
}
