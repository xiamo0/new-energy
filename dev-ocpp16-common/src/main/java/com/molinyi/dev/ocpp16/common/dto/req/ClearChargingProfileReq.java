package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.ChargingProfilePurpose;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClearChargingProfileReq extends BaseMessage {

    private Integer id;

    private Integer connectorId;

    private ChargingProfilePurpose chargingProfilePurpose;

    private Integer stackLevel;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
