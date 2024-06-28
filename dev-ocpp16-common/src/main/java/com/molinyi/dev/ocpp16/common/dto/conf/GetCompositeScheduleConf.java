package com.molinyi.dev.ocpp16.common.dto.conf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.GetCompositeScheduleStatus;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.ChargingSchedule;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCompositeScheduleConf extends BaseMessage {

    @NonNull
    private GetCompositeScheduleStatus status;

    private Integer connectorId;

    private LocalDateTime scheduleStart;

    private ChargingSchedule chargingSchedule;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
