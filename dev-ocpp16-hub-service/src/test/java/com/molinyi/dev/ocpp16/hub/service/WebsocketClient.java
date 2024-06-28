package com.molinyi.dev.ocpp16.hub.service;

import com.molinyi.dev.ocpp16.common.dto.CallMessage;
import com.molinyi.dev.ocpp16.common.dto.MessageMapping;
import com.molinyi.dev.ocpp16.common.dto.req.HeartbeatReq;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class WebsocketClient {

    public static void main(String[] args) {
        URI uri = URI.create("ws://localhost:8000/ocpp16-hub-service/ocpp16/123");
        Map<String, String> header = new HashMap();
        header.put("Authorization", "Bearer 123");
        MyWebSocketClient client = new MyWebSocketClient(uri, header);

        client.connect(); // 连接到WebSocket服务器
        final HeartbeatReq heartbeatReq = new HeartbeatReq();

        CallMessage callMessage = new CallMessage<HeartbeatReq>("qaz", MessageMapping.HEARTBEAT.getAction(), heartbeatReq);
        client.send(callMessage.toString());
        // 可以在这里添加消息发送逻辑等
    }

}

class MyWebSocketClient extends WebSocketClient {

    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("Connected to the server.");
    }

    @Override
    public void onMessage(String message) {
        System.out.println("Received message from the server: " + message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("Connection closed by " + (remote ? "remote peer" : "us") + " Code: " + code + " Reason: " + reason);
    }

    @Override
    public void onError(Exception ex) {
        System.err.println("Error occurred: " + ex);
    }

    public MyWebSocketClient(URI serverUri, Map<String, String> httpHeaders) {
        super(serverUri, httpHeaders);
    }
}