package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(force = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChargingSchedule extends BaseMessage {

    private Integer duration;

    @JsonFormat(pattern = DatePattern.UTC_PATTERN)
    private LocalDateTime startSchedule;

    @NonNull
    private ChargingRateUnitEnum chargingRateUnit;

    @NonNull
    private List<ChargingSchedulePeriod> chargingSchedulePeriod;

    // 保留1位小数
    private BigDecimal minChargingRate;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}