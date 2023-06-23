package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.exceptions.ValidationException;
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
            if (value.isAfter(LocalDate.of(2015,6,6)))
                throw new ValidationException("La fecha de inicio de contrato no puede ser superior al 6 de Junio de 2015");
            else if (value.isBefore(LocalDate.of(2015,1,1)))
                throw new ValidationException("La fecha de inicio de contrato no puede ser inferior al 1 de Enero de  2015");
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
