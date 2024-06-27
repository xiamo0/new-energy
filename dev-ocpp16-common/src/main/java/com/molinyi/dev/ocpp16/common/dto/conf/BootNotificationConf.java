package com.molinyi.dev.ocpp16.common.dto.conf;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.RegistrationStatus;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BootNotificationConf extends BaseMessage {

    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private LocalDateTime currentTime;

    private Integer interval;

    private RegistrationStatus status;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
