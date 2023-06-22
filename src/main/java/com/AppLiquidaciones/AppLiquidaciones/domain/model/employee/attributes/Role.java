package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

@Builder
public class Role {

    private String value;

    public Role(String value) {
        validatedRole(value);
        this.value = value;
    }

    private void validatedRole(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("El cargo no puede ser nulo o vacio");
        } else if (value.length() < 10) {
            throw new IllegalArgumentException("El cargo debe tener al menos 10 caracteres");
        } else if (value.length() > 30) {
            throw new IllegalArgumentException("El cargo debe tener maximo 20 caracteres");
        } else if (value.equals("*,/,+,-")){
            throw new IllegalArgumentException("El cargo no puede ser *,+,-,*");
        } else if (value.equals(" ")){
            throw new IllegalArgumentException("El cargo no puede ser un espacio");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Role{" +
                "value='" + value + '\'' +
                '}';
    }
}
