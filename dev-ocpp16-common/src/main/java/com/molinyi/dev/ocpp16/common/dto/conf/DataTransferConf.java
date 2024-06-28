package com.molinyi.dev.ocpp16.common.dto.conf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.DataTransferStatus;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataTransferConf extends BaseMessage {

    @NonNull

    private DataTransferStatus status;

    private String data;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
