package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.infypower.fycev.device.ocpp.common.AbstractRequestAction;
import com.infypower.fycev.device.ocpp.response.RemoteStopTransactionResponse;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteStopTransactionReq extends BaseMessage {

    @NonNull
    private Integer transactionId;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}