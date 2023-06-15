package com.AppLiquidaciones.AppLiquidaciones.domain.model.user.attributes;

import lombok.Builder;

@Builder
public class Username {
    private String value;

    public String getValue() {
        return value;
    }
}
