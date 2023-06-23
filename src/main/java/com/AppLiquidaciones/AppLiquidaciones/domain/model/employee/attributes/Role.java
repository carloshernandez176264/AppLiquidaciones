package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.exceptions.ValidationException;
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
            throw new ValidationException("El cargo no puede ser nulo o vacio");
        } else if (value.length() < 10) {
            throw new ValidationException("El cargo debe tener al menos 10 caracteres");
        } else if (value.length() > 30) {
            throw new ValidationException("El cargo debe tener maximo 20 caracteres");
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
