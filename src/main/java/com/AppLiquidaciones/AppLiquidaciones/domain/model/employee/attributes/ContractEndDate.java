package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

import java.time.LocalDate;
import java.util.Date;

@Builder
public class ContractEndDate {

    private LocalDate value;

    public ContractEndDate(LocalDate value) {
        //validatedContractEndDate(value);
        this.value = value;
    }

    private void validatedContractEndDate(LocalDate value) {
        if (value.isBefore(LocalDate.now().minusYears(1))) {
            throw new IllegalArgumentException(" La fecha de finalización del contrato no puede ser inferior a un año atras");
        } else if (value.isAfter(LocalDate.now().plusYears(1))) {
            throw new IllegalArgumentException(" La fecha de finalización del contrato no puede ser superior a un año despues");
        } else if (value.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException(" La fecha de finalización del contrato no puede ser anterior a la fecha actual");
        }
    }


    public LocalDate getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ContractEndDate{" +
                "value=" + value +
                '}';
    }
}
