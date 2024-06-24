package com.molinyi.dev.ocpp16.hub.service.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;

@Slf4j
@Component
public class Ocpp16HandshakeInterceptor implements HandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
        log.info("beforeHandshake url {}, body {}", request.getURI(), request.getBody());
        final String path = request.getURI().getPath();
        String[] parts = path.split("/");

        // 获取最后一部分，即"123"
        String evseId = parts[parts.length - 1];
        final boolean matches = evseId.matches("-?\\d+");

        return matches;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {
        log.info("afterHandshake url {}", request.getURI());
    }
}
