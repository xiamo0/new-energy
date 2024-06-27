package com.molinyi.dev.ocpp16.common.dto.fieldtype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChargingProfile extends BaseMessage {

    @NonNull
    private Integer chargingProfileId;

    private Integer transactionId;

    @NonNull
    private Integer stackLevel;

    @NonNull
    private ChargingProfilePurpose chargingProfilePurpose;

    @NonNull
    private ChargingProfileKind chargingProfileKind;

    private RecurrencyKind recurrencyKind;

    private LocalDateTime validFrom;

    private Date validTo;

    private ChargingSchedule chargingSchedule;

}
