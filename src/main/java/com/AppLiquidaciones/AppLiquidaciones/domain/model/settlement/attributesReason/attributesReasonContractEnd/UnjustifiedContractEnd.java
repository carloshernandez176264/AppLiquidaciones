package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributesReason.attributesReasonContractEnd;

import lombok.Builder;

@Builder
public class UnjustifiedContractEnd {

        private String value;

        public UnjustifiedContractEnd(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
}
