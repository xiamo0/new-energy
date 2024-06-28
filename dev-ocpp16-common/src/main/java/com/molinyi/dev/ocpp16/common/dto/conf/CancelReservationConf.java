package com.molinyi.dev.ocpp16.common.dto.conf;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.CancelReservationStatus;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.*;

@Data
@NoArgsConstructor(force = true)
public class CancelReservationConf extends BaseMessage {

    @NonNull
    @JsonProperty
    private CancelReservationStatus status;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
