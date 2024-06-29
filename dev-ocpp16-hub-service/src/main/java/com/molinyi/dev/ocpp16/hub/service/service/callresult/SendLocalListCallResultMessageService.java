package com.molinyi.dev.ocpp16.hub.service.service.callresult;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketSession;

@Slf4j
@Service("SendLocalListCallResultMessageService")
public class SendLocalListCallResultMessageService implements BaseCallResultMessageService {
    @Override
    public void handleCallResultMessage(WebSocketSession session, String message) {

    }
}
