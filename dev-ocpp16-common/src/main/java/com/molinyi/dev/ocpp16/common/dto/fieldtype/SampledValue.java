package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class SampledValue extends BaseMessage {

    @NonNull
    private String value;

    private ReadingContext context;
    private ValueFormat format;

    private Measurand Measurand;

    private Phase phase;

    private Location location;

    private UnitOfMeasure unit;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }
}
