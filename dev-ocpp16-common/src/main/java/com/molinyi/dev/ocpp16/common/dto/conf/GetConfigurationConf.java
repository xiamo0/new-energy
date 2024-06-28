package com.molinyi.dev.ocpp16.common.dto.conf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.KeyValue;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetConfigurationConf extends BaseMessage {

    private List<KeyValue> configurationKey;

    private List<String> unknownKey;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
