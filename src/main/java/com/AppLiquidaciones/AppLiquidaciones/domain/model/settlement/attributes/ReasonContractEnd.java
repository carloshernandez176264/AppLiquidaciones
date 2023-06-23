package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes;


import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.attributesReasonContractEnd.JustifyOrVoluntaryContractEnd;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.attributesReasonContractEnd.UnjustifiedContractEnd;

import lombok.Builder;

@Builder
public class ReasonContractEnd {

        private String value;

        private JustifyOrVoluntaryContractEnd justifyContractEnd;

        private UnjustifiedContractEnd unjustifiedContractEnd;

    public ReasonContractEnd(String value, JustifyOrVoluntaryContractEnd justifyContractEnd, UnjustifiedContractEnd unjustifiedContractEnd) {
        this.value = value;
        this.justifyContractEnd = justifyContractEnd;
        this.unjustifiedContractEnd = unjustifiedContractEnd;
    }

    public String getValue() {
        return value;
    }

    public JustifyOrVoluntaryContractEnd getJustifyContractEnd() {
        return justifyContractEnd;
    }

    public UnjustifiedContractEnd getUnjustifiedContractEnd() {
        return unjustifiedContractEnd;
    }
}
