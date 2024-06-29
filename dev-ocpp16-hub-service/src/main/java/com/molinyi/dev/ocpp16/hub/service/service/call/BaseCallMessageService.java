package com.molinyi.dev.ocpp16.hub.service.service.call;

import org.springframework.web.socket.WebSocketSession;

public interface BaseCallMessageService {
    void handleCallMessage(WebSocketSession session, String message);

}
