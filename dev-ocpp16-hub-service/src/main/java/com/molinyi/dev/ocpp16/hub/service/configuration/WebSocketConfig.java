package com.molinyi.dev.ocpp16.hub.service.configuration;

import com.molinyi.dev.ocpp16.hub.service.handler.Ocpp16HandshakeHandler;
import com.molinyi.dev.ocpp16.hub.service.handler.Ocpp16MessageHandler;
import com.molinyi.dev.ocpp16.hub.service.interceptor.Ocpp16HandshakeInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Slf4j
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.
                addHandler(new Ocpp16MessageHandler(), "/ocpp16/**")
                .setHandshakeHandler(new Ocpp16HandshakeHandler())
                .addInterceptors(new Ocpp16HandshakeInterceptor());

    }

}
