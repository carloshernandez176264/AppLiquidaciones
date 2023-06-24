package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributesReason.attributesReasonContractEnd;

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
