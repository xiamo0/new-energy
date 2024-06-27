package com.molinyi.dev.ocpp16.common.dto.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.molinyi.dev.ocpp16.common.dto.BaseMessage;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BootNotificationReq extends BaseMessage {

    private String chargeBoxSerialNumber;

    @NonNull
    private String chargePointModel;

    private String chargePointSerialNumber;

    @NonNull
    private String chargePointVendor;

    private String firmwareVersion;

    private String iccid;

    private String imsi;

    private String meterType;

    private String meterSerialNumber;

    @Override
    public String toString() {
        return PoJoService.serialize(this);
    }

    public static void main(String[] args) {
        final BootNotificationReq bootNotificationReq = new BootNotificationReq();
        System.out.println(bootNotificationReq);
        bootNotificationReq.setIccid("123");
        System.out.println(bootNotificationReq);

        final BootNotificationReq bootNotificationReq1 = PoJoService.deSerializable(bootNotificationReq.toString(), BootNotificationReq.class);
        System.out.println(bootNotificationReq1);

    }
}
