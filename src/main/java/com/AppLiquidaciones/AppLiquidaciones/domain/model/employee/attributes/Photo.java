package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

@Builder
public class Photo {

    private String value;

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "value='" + value + '\'' +
                '}';
    }
}
