package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.exceptions.ValidationException;
import jakarta.validation.Valid;
import lombok.Builder;


@Builder
public class Salary {
   private Double value;

    public Salary(Double value) {
        validateSalary(value);
        this.value = value;
    }

    private void validateSalary(Double value){
        if (value <= 1160000){
            throw new ValidationException("El salario no debe ser inferior al salario minimo");
     } else if (value > 7000000) {
            throw new ValidationException("El salario no debe ser superior a 7 millones");
        }
    }

    public  Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "value=" + value +
                '}';
    }
}
