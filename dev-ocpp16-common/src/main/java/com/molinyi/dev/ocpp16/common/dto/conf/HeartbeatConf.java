package com.molinyi.dev.ocpp16.common.dto.conf;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class HeartbeatConf extends BaseMessage {

    @JsonProperty(value = "currentTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private LocalDateTime currentTime;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }

}
