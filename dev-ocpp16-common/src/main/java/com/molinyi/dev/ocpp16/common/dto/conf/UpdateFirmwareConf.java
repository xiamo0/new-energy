package com.molinyi.dev.ocpp16.common.dto.conf;

import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateFirmwareConf extends BaseMessage {

    @Override
    public String toString() {
        return "{}";
    }
}
