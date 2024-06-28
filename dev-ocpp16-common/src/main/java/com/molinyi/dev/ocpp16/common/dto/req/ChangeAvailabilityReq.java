package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.AvailabilityType;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor(force = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeAvailabilityReq extends BaseMessage {


    @NonNull
    private Integer connectorId;

    @NonNull
    private AvailabilityType type;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
