package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.Identification;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributes.ReasonContractEnd;
import lombok.Builder;

@Builder
public class Settlement {

    private final Identification identification;

    private final ReasonContractEnd reasonContractEnd;

    public Settlement(Identification identification, ReasonContractEnd reasonContractEnd) {
        this.identification = identification;
        this.reasonContractEnd = reasonContractEnd;
    }

    public Identification getIdentification() {
        return identification;
    }

    public ReasonContractEnd getReasonContractEnd() {
        return reasonContractEnd;
    }
}
