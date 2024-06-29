package com.molinyi.dev.ocpp16.hub.service.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

@Slf4j
@Service
public class WebsocketHandshakeHandler extends DefaultHandshakeHandler {


    @Override
    protected boolean isValidOrigin(ServerHttpRequest request) {

        return super.isValidOrigin(request);
    }

}
