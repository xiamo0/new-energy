package com.molinyi.dev.ocpp16.common.dto.conf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.ClearCacheStatus;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClearCacheConf extends BaseMessage {

    @NonNull
    private ClearCacheStatus status;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }

}
