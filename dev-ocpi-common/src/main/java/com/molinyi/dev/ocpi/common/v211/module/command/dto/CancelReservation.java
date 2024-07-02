package com.molinyi.dev.ocpi.common.v211.module.command.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Data
public class CancelReservation {

    @NonNull
    @JsonProperty("response_url")
    private String responseUrl;

    @NonNull
    @JsonProperty("reservation_id")
    private String reservationId;

}
