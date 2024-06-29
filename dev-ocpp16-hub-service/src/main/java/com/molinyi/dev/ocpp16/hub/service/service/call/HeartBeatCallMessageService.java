package com.molinyi.dev.ocpp16.hub.service.service.call;

import com.molinyi.dev.ocpp16.common.dto.CallMessage;
import com.molinyi.dev.ocpp16.common.dto.CallResultMessage;
import com.molinyi.dev.ocpp16.common.dto.conf.HeartbeatConf;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.time.LocalDateTime;

@Slf4j
@Service("HeartbeatCallMessageService")
public class HeartBeatCallMessageService implements BaseCallMessageService {

    @Override
    public void handleCallMessage(WebSocketSession session, String message) {

        final CallMessage callMessage = PoJoService.deserialize(message);
        final HeartbeatConf heartbeatConf = new HeartbeatConf();
        heartbeatConf.setCurrentTime(LocalDateTime.now());
        CallResultMessage callResultMessage = new CallResultMessage(callMessage.uniqueId(), heartbeatConf);
        try {
            session.sendMessage(new TextMessage(callResultMessage.toString()));
        } catch (Exception e) {
            log.error("error {}", e.getMessage());
        }

    }
}
