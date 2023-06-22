package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import jakarta.validation.Valid;
import lombok.Builder;


@Builder
public class Salary {
   private Integer value;

    public Salary(Integer value) {
        validateSalary(value);
        this.value = value;
    }

    public void validateSalary(Integer value){
        if (value <= 1160000){
            throw new IllegalArgumentException("El salario no debe ser inferior al salario minimo");
     } else if (value > 7000000) {
            throw new IllegalArgumentException("El salario no debe ser superior a 7 millones");
        }else if (value.equals("*,/,+,-")) {
            throw new IllegalArgumentException("El salario no debe ser un character");
        }else if (value.equals(" "))
            throw new IllegalArgumentException("El salario no debe tener espacios en blanco");
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "value=" + value +
                '}';
    }
}
