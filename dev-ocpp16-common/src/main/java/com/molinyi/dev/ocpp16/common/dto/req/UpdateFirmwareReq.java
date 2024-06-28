package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateFirmwareReq extends BaseMessage {

    @NonNull
    private String location;

    private Integer retries;

    @NonNull
    private Date retrieveDate;

    private Integer retryInterval;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
