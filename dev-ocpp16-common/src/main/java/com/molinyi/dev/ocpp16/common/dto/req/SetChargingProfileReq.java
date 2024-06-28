package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.ChargingProfile;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetChargingProfileReq extends BaseMessage {

    @NonNull
    private Integer connectorId;

    @NonNull
    private ChargingProfile csChargingProfiles;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
