package com.molinyi.dev.ocpp16.hub.service.service.callresult;

import org.springframework.web.socket.WebSocketSession;

public interface BaseCallResultMessageService {
    void handleCallResultMessage(WebSocketSession session, String message);
}
