package com.molinyi.dev.ocpp16.common.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.molinyi.dev.ocpp16.common.dto.conf.HeartbeatConf;

import java.io.Serializable;

public class BaseMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "{}";
    }

    public String serialize() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T deSerializable(String json,Class<T> type){

        final ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        try {
            return mapper.readValue(json, type);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}
