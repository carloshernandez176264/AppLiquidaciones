package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.exceptions.ValidationException;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;

@Builder
public class Name {

    private String value;

    public Name(String value) {
        validateName(value);
        this.value = value;
    }
    private void validateName(String value) {
        if(value.equals("*,/,+,-"))
            throw new ValidationException("El nombre no puede ser un caracter especial");
        else if(value.equals(" "))
            throw new ValidationException("El nombre no puede ser un espacio");
        else if(value.length() < 3)
            throw new ValidationException("El nombre no puede ser inferior 3 caracteres");
        else if(value.length() > 50)
            throw new ValidationException("El nombre no puede ser mayor a 50 caracteres");
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Name{" +
                "value='" + value + '\'' +
                '}';
    }
}
