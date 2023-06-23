package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.attributesReasonContractEnd;

import lombok.Builder;

@Builder
public class JustifyOrVoluntaryContractEnd {

        private String value;

        public JustifyOrVoluntaryContractEnd(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
}
