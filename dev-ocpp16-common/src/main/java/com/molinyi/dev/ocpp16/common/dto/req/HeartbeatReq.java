package com.molinyi.dev.ocpp16.common.dto.req;

import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HeartbeatReq extends BaseMessage {

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
