package com.molinyi.dev.ocpi.common.v211.module.command.dto;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpi.common.v211.module.token.dto.Token;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class ReserveNow implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    @JsonProperty("response_url")
    private String responseUrl;

    @NonNull
    private Token token;

    @NonNull
    @JsonProperty("expiry_date")
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private Date expiryDate;

    @NonNull
    @JsonProperty("reservation_id")
    private String reservationId;

    @NonNull
    @Size(max = 39)
    @JsonProperty("location_id")
    private String locationId;

    @Size(max = 39)
    @JsonProperty("evse_uid")
    private String evseUid;

}
