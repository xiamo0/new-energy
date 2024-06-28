package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelReservationReq extends BaseMessage {

    @NonNull
    @JsonProperty("reservation_id")
    private Integer reservationId;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }

}
