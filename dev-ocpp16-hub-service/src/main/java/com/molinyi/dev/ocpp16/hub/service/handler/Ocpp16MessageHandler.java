package com.molinyi.dev.ocpp16.hub.service.handler;

import com.molinyi.dev.ocpp16.common.dto.CallMessage;
import com.molinyi.dev.ocpp16.common.dto.MessageMapping;
import com.molinyi.dev.ocpp16.common.dto.service.PoJoService;
import com.molinyi.dev.ocpp16.hub.service.service.Ocpp16MessageRecordsService;
import com.molinyi.dev.ocpp16.hub.service.service.call.BaseCallMessageService;
import com.molinyi.dev.ocpp16.hub.service.service.callresult.BaseCallResultMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketSession;

import java.util.Objects;

@Slf4j
@Service
public class Ocpp16MessageHandler extends MessageHandler {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private Ocpp16MessageRecordsService ocpp16MessageRecordsService;

    @Override
    public void handleCallMessage(WebSocketSession session, String message) {

        final CallMessage callMessage = PoJoService.deserialize(message);
        final String action = callMessage.action();

        final BaseCallMessageService baseCallMessageService = applicationContext.getBean(action + "CallMessageService", BaseCallMessageService.class);
        if (Objects.isNull(baseCallMessageService)) {
            log.error("error {}", "can not find service");
            return;
        }
        baseCallMessageService.handleCallMessage(session, message);

    }

    @Override
    public void handleCallResultMessage(WebSocketSession session, String message) {

        String action = getAction(session, message);
        PoJoService.deserialize(message, action);
        final BaseCallResultMessageService baseCallResultMessageService = applicationContext.getBean(MessageMapping.HEARTBEAT.getAction() + "CallResultMessageService", BaseCallResultMessageService.class);
        if (Objects.isNull(baseCallResultMessageService)) {
            log.error("error {}", "can not find service");
            return;
        }
        baseCallResultMessageService.handleCallResultMessage(session, message);


    }

    @Override
    public void handleCallErrorMessage(WebSocketSession session, String message) {
        log.error("error {}", "can not find service");

    }


    public String getAction(WebSocketSession session, String message) {
        String result = message.substring(1, message.length() - 1);
        final String[] split = result.split(",", 2);
        final String[] split1 = split[1].split(",", 2);
        final String uniqueId = split1[0];
        // 查询发送消息记录
        return ocpp16MessageRecordsService.getMessageAction(uniqueId);
    }
}
