package com.molinyi.dev.ocpp16.hub.service.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class Ocpp16HandshakeInterceptor implements HandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
        log.info("beforeHandshake url {}, body {}", request.getURI(), request.getBody());
        final String path = request.getURI().getPath();
        String[] parts = path.split("/");

        // 获取最后一部分，即"123"
        String evseId = parts[parts.length - 1];
        final boolean matches = evseId.matches("-?\\d+");
        if (!matches){
            response.setStatusCode(HttpStatusCode.valueOf(404));
        }

        WebSocketHttpHeaders headers = new WebSocketHttpHeaders(request.getHeaders());
        final List<String> authorization = headers.get("authorization");
        if (CollectionUtils.isEmpty(authorization)){
            //要求用户的身份认证
            response.setStatusCode(HttpStatusCode.valueOf(401));
            return false;
        }
        if (authorization.get(0).equals("123")){
            //认证失败
            response.setStatusCode(HttpStatusCode.valueOf(403));
            return false;
        }


        return matches;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {
        log.info("afterHandshake url {}", request.getURI());
    }
}
