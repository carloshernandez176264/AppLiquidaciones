package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import jakarta.validation.constraints.Pattern;
import lombok.Builder;

@Builder
public class Name {

    @Pattern(regexp = "[a-zA-Z\\s]{5,50}$+", message = "nombres solo se permiten letras y espacios")
    private String value;

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
