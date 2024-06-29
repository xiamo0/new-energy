package com.molinyi.dev.ocpp16.hub.service.service.call;

import com.molinyi.dev.ocpp16.common.dto.CallMessage;
import com.molinyi.dev.ocpp16.common.dto.CallResultMessage;
import com.molinyi.dev.ocpp16.common.dto.conf.BootNotificationConf;
import com.molinyi.dev.ocpp16.common.dto.fieldtype.RegistrationStatus;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.time.LocalDateTime;

@Slf4j
@Service("BootNotificationCallMessageService")
public class BootNotificationCallMessageService implements BaseCallMessageService {
    @Override
    public void handleCallMessage(WebSocketSession session, String message) {

        final CallMessage callMessage = PoJoService.deserialize(message);
        final BootNotificationConf bootNotificationConf = new BootNotificationConf();
        bootNotificationConf.setCurrentTime(LocalDateTime.now());
        bootNotificationConf.setInterval(10);
        bootNotificationConf.setStatus(RegistrationStatus.Accepted);
        CallResultMessage callResultMessage = new CallResultMessage(callMessage.uniqueId(), bootNotificationConf);

        try {
            session.sendMessage(new TextMessage(callResultMessage.toString()));
        } catch (Exception e) {
            log.error("error {}", e.getMessage());
        }

    }
}
