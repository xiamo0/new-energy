package com.molinyi.dev.ocpp16.common.dto;

import com.molinyi.dev.ocpp16.common.dto.conf.AuthorizeConf;
import com.molinyi.dev.ocpp16.common.dto.conf.BootNotificationConf;
import com.molinyi.dev.ocpp16.common.dto.conf.HeartbeatConf;
import com.molinyi.dev.ocpp16.common.dto.req.AuthorizeReq;
import com.molinyi.dev.ocpp16.common.dto.req.BootNotificationReq;
import com.molinyi.dev.ocpp16.common.dto.req.HeartbeatReq;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageMapping {

    AUTHORIZE("Authorize", AuthorizeReq.class, AuthorizeConf.class),
    BOOT_NOTIFICATION("BootNotification", BootNotificationReq.class, BootNotificationConf.class),
    HEARTBEAT("Heartbeat", HeartbeatReq.class, HeartbeatConf.class);


    private String action;
    private final Class reqMessageClass;
    private final Class confMessageClass;


}