package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Value;

@Builder
@Valid
public class Salary {

    @Pattern(regexp = "[0-9]{1,10},^[1160000-7000000]", message = "El salario no debe ser superior a 7 millones")
    private Integer value;

    public Salary(Integer value) {
        validateSalary(value);
        this.value = value;
    }

    public void validateSalary(Integer value){
        if (value <= 1160000)
            throw new IllegalArgumentException("El salario no debe ser inferior al salario minimo");
        else if (value > 7000000)
            throw new IllegalArgumentException("El salario no debe ser superior a 7 millones");
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
