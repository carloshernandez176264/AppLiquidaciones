package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import lombok.Builder;

@Builder
public class Photo {

    private String value;

    public Photo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
