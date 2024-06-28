package com.molinyi.dev.ocpp16.common.dto.conf;

import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DiagnosticsStatusNotificationConf extends BaseMessage {

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
