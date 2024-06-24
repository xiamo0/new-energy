package com.molinyi.dev.ocpp16.hub.service.handler;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

public class Ocpp16HandshakeHandler extends DefaultHandshakeHandler {

    @Override
    protected boolean isValidOrigin(ServerHttpRequest request) {
        return super.isValidOrigin(request);
    }

}
