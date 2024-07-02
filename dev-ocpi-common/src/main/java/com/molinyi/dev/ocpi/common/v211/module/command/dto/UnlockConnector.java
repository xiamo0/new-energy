package com.molinyi.dev.ocpi.common.v211.module.command.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UnlockConnector implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @JsonProperty("response_url")
    private String responseUrl;

    @NonNull
    @Size(max = 39)
    @JsonProperty("location_id")
    private String locationId;

    @NonNull
    @Size(max = 39)
    @JsonProperty("evse_uid")
    private String evseUid;

    @NonNull
    @Size(max = 36)
    @JsonProperty("connector_id")
    private String connectorId;

}
