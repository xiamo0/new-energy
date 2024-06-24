package com.molinyi.dev.ocpp16.hub.service.util;

import org.springframework.web.socket.WebSocketSession;

public class OcppUtil {

    public static String getEvseId(WebSocketSession session){
        final String path = session.getUri().getPath();
        String[] parts = path.split("/");
        // 获取最后一部分，即"123"
        String evseId = parts[parts.length - 1];

        return evseId;

    }

}
