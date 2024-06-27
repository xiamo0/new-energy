package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonSerialize
public class HeartbeatReq extends BaseMessage {

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
