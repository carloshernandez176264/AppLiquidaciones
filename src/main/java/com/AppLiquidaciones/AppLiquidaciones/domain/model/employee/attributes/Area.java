package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

@Builder
public class Area {

    private String value;

    public Area(String value) {
        validateArea(value);
        this.value = value;
    }

    private void validateArea(String value) {
        if (value.equals("*,/,+,-"))
            throw new IllegalArgumentException("El area no puede ser un caracter especial");
        else if (value.equals(" "))
            throw new IllegalArgumentException("El area no puede ser un espacio");
        else if (value.length() < 3)
            throw new IllegalArgumentException("El area no puede ser inferior 3 caracteres");
        else if (value.length() > 50)
            throw new IllegalArgumentException("El area no puede ser mayor a 50 caracteres");
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Area{" +
                "value='" + value + '\'' +
                '}';
    }
}
