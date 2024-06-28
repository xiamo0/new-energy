package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.MeterValue;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.Reason;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StopTransactionReq extends BaseMessage {

    private String idTag;

    @NonNull
    private Integer meterStop;

    @NonNull
    @JsonSerialize()
    private LocalDateTime timestamp;

    @NonNull
    private Integer transactionId;

    private Reason reason;

    private List<MeterValue> transactionData;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
