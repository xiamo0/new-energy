package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeterValue extends BaseMessage {

    @NonNull
    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private LocalDateTime timestamp;

    @NonNull
    private List<SampledValue> sampledValue;

    @Override
    public String toString() {
       return PoJoService.serialize(this);
    }
}
