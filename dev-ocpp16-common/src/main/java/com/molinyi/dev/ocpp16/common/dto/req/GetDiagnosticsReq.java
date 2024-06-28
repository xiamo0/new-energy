package com.molinyi.dev.ocpp16.common.dto.req;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDiagnosticsReq extends BaseMessage {


    @NonNull
    private String location;

    private Integer retries;

    private Integer retryInterval;

    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private LocalDateTime startTime;

    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private LocalDateTime stopTime;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }

}
