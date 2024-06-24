package com.molinyi.dev.ocpp16.hub.service.handler;

import com.molinyi.dev.ocpp16.hub.service.cache.Ocpp16CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.net.URI;

@Slf4j
@Service
@DependsOn({"ocpp16CacheService"})
public class Ocpp16MessageHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message)
            throws InterruptedException, IOException {

        String payload = message.getPayload();
        session.sendMessage(new TextMessage("response " + payload + " "));

    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        super.afterConnectionEstablished(session);
        Ocpp16CacheService.addSession(session);

    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        super.handleMessage(session, message);
    }

    @Override
    protected void handlePongMessage(WebSocketSession session, PongMessage message) throws Exception {
        log.info("Pong message received");
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        log.error("Transport error occurred: {}", exception.getMessage());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        log.info("Connection closed with status: {}", status.getReason());
        final URI uri = session.getUri();
        log.info("Connection closed with URI: {}", uri.toString());
        Ocpp16CacheService.removeSession(session);
    }

}
