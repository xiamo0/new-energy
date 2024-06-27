package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
@NoArgsConstructor(force = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChargingSchedulePeriod extends BaseMessage {
    @NonNull
    private Integer startPeriod;
    // 保留1位小数
    @NonNull
    private BigDecimal limit;

    private Integer numberPhases;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}