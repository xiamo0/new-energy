package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.MeterValue;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeterValuesReq extends BaseMessage {

    @NonNull
    private Integer connectorId;

    private Integer transactionId;

    @NonNull
    private List<MeterValue> meterValue;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}