package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.ChargePointErrorCode;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.ChargePointStatus;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusNotificationReq extends BaseMessage {

    @NonNull
    private Integer connectorId;

    @NonNull
    private ChargePointErrorCode errorCode;

    private String info;

    @NonNull
    private ChargePointStatus status;

    private String timestamp;

    private String vendorId;

    private String vendorErrorCode;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
