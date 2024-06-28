package com.molinyi.dev.ocpp16.hub.service.configuration;

import com.molinyi.dev.ocpp16.hub.service.handler.Ocpp16HandshakeHandler;
import com.molinyi.dev.ocpp16.hub.service.handler.WebsocketMessageHandler;
import com.molinyi.dev.ocpp16.hub.service.interceptor.Ocpp16HandshakeInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Slf4j
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Autowired
    WebsocketMessageHandler ocpp16MessageHandler;

    @Autowired
    Ocpp16HandshakeHandler ocpp16HandshakeHandler;

    @Autowired
    Ocpp16HandshakeInterceptor cpp16HandshakeInterceptor;
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.
                addHandler(ocpp16MessageHandler, "/ocpp16/**")
                .setHandshakeHandler(ocpp16HandshakeHandler)
                .addInterceptors(cpp16HandshakeInterceptor);

    }

}
