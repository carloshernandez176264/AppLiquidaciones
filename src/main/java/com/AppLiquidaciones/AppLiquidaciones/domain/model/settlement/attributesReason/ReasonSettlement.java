package com.AppLiquidaciones.AppLiquidaciones.domain.model.settlement.attributesReason;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.ContractEndDate;
import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.Identification;
import lombok.Builder;

@Builder
public class ReasonSettlement {

    private final Identification identification;

    private final ReasonContractEnd reasonContractEnd;

    private final ContractEndDate contractEndDate;

    public ReasonSettlement(Identification identification, ReasonContractEnd reasonContractEnd, ContractEndDate contractEndDate) {
        this.identification = identification;
        this.reasonContractEnd = reasonContractEnd;
        this.contractEndDate = contractEndDate;
    }

    public Identification getIdentification() {
        return identification;
    }

    public ReasonContractEnd getReasonContractEnd() {
        return reasonContractEnd;
    }

    public ContractEndDate getContractEndDate() {
        return contractEndDate;
    }
}
