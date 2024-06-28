package com.molinyi.dev.ocpp16.hub.service.handler;

import com.molinyi.dev.ocpp16.common.dto.MessageType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.WebSocketSession;

@Slf4j
public abstract class MessageHandler /*implements BaseHandler*/ {

    void handleRequest(WebSocketSession session, String message) {
        if (message.startsWith("[" + MessageType.CALL.getValue())) {
            handleCallMessage(session, message);

        }
        if (message.startsWith("[" + MessageType.CALL_RESULT.getValue())) {
            handleCallResultMessage(session, message);

        }

        if (message.startsWith("[" + MessageType.CALL_ERROR.getValue())) {

            handleCallErrorMessage(session, message);

        }


    }

    public abstract void handleCallMessage(WebSocketSession session, String message);

    public abstract void handleCallResultMessage(WebSocketSession session, String message);

    public abstract void handleCallErrorMessage(WebSocketSession session, String message);

}
