package com.molinyi.dev.ocpp16.hub.service.cache;

import com.molinyi.dev.ocpp16.hub.service.util.OcppUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketSession;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class Ocpp16CacheService {

    private static Map<String, WebSocketSession> cahce = new ConcurrentHashMap<>();

    public void addSession(WebSocketSession session) {

        final String evseId = OcppUtil.getEvseId(session);
        cahce.put(evseId, session);

    }

    public void removeSession(WebSocketSession session) {

        final String evseId = OcppUtil.getEvseId(session);
        cahce.remove(evseId);

    }

    public long getSessionCount() {

        return cahce.size();

    }
}
