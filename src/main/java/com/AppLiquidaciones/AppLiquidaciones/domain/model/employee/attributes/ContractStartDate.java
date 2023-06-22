package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

import java.time.LocalDate;
import java.util.Date;

@Builder
public class ContractStartDate {

    private LocalDate value;

    public ContractStartDate(LocalDate value) {
        validatedContractStartDate(value);
        this.value = value;
    }

    private void validatedContractStartDate(LocalDate value) {
        if (value == null) {
            throw new IllegalArgumentException("La fecha de inicio de contrato no puede estar vacia");
        } else if (value.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de inicio de contrato no puede ser el día siguiente a la fecha actual");
        }

    }


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
