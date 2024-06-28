package com.molinyi.dev.ocpp16.common.dto.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.molinyi.dev.ocpp16.common.dto.*;

import java.util.Arrays;
import java.util.Objects;

public class PoJoService {

    public static String serialize(BaseMessage message) {

        if (Objects.isNull(message)) {
            return "{}";
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        try {
            return mapper.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    public static CallMessage deserialize(String str) {

        //[<MessageTypeId>, "<UniqueId>", "<Action>", {<Payload>}]
        String result = str.substring(1, str.length() - 1);
        final String[] split1 = result.split(",", 2);
        String MessageTypeId = split1[0];
        final String[] split2 = split1[1].split(",", 3);

        final String uniqueId = split2[0].trim();
        final String action = split2[1].trim();
        final String payload = split2[2].trim();
        final BaseMessage baseMessage = deSerializePlayload(MessageType.CALL, action, payload);

        return new CallMessage<>(uniqueId, action, baseMessage);

    }

    public static CallResultMessage deserialize(String str, String action) {
        // [<MessageTypeId>, "<UniqueId>", {<Payload>}]
        String result = str.substring(1, str.length() - 1);
        final String[] split = result.split(",", 2);

        final String messageTypeId = split[0];
        final String[] split1 = split[1].split(",", 2);

        final String uniqueId = split1[0];
        final String payload = split1[1];

        final BaseMessage baseMessage = deSerializePlayload(MessageType.CALL_RESULT, action, payload);

        return new CallResultMessage<>(uniqueId, baseMessage);

    }

    public static BaseMessage deSerializePlayload(MessageType messageType, String action, String playloadStr) {

        final MessageMapping messageMapping = Arrays.stream(MessageMapping.values()).filter(e -> {
            return e.getAction().equals(action);
        }).findFirst().orElse(null);
        if (messageMapping == null) {
            return null;
        }
        if (MessageType.CALL.equals(messageType)) {
            return deSerializable(playloadStr, messageMapping.getReqMessageClass());
        }
        if (MessageType.CALL_RESULT.equals(messageType)) {
            return deSerializable(playloadStr, messageMapping.getConfMessageClass());
        }
        return null;

    }

    public static <T extends BaseMessage> T deSerializable(String json, Class<T> type) {

        final ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.registerModule(new JavaTimeModule());
        try {
            return mapper.readValue(json, type);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}
