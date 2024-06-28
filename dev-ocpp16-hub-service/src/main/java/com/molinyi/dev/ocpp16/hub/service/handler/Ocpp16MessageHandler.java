package com.molinyi.dev.ocpp16.hub.service.handler;

import com.molinyi.dev.ocpp16.common.dto.CallMessage;
import com.molinyi.dev.ocpp16.common.dto.CallResultMessage;
import com.molinyi.dev.ocpp16.common.dto.MessageMapping;
import com.molinyi.dev.ocpp16.common.dto.conf.BootNotificationConf;
import com.molinyi.dev.ocpp16.common.dto.conf.HeartbeatConf;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.RegistrationStatus;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.time.LocalDateTime;
import java.util.Objects;

@Slf4j
@Service
public class Ocpp16MessageHandler extends MessageHandler {


    @Override
    public void handleCallMessage(WebSocketSession session, String message) {

        final CallMessage callMessage = PoJoService.deserialize(message);
        final String action = callMessage.action();

        CallResultMessage callResultMessage = null;
        if (MessageMapping.HEARTBEAT.getAction().equals(action)) {
            final HeartbeatConf heartbeatConf = new HeartbeatConf();
            heartbeatConf.setCurrentTime(LocalDateTime.now());
            callResultMessage = new CallResultMessage(callMessage.uniqueId(), heartbeatConf);
        }
        if (MessageMapping.BOOT_NOTIFICATION.getAction().equals(action)) {
            final BootNotificationConf bootNotificationConf = new BootNotificationConf();
            bootNotificationConf.setCurrentTime(LocalDateTime.now());
            bootNotificationConf.setInterval(10);
            bootNotificationConf.setStatus(RegistrationStatus.Accepted);
            callResultMessage = new CallResultMessage(callMessage.uniqueId(), bootNotificationConf);
        }

        if (Objects.isNull(callResultMessage)) {
            return;
        }
        try {
            session.sendMessage(new TextMessage(callResultMessage.toString()));
        } catch (Exception e) {
            log.error("error {}", e.getMessage());
        }


    }

    @Override
    public void handleCallResultMessage(WebSocketSession session, String message) {

    }

    @Override
    public void handleCallErrorMessage(WebSocketSession session, String message) {

    }
}
