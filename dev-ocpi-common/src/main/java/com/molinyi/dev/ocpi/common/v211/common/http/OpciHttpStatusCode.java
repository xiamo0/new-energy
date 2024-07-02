package com.molinyi.dev.ocpi.common.v211.common.http;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ocpi http 响应码含义
 */
@Getter
@AllArgsConstructor
public enum OpciHttpStatusCode {

    OK_200(200, "the object already existed and has successfully been updated"),
    OK_201(200, "Created when the object has been newly created in the server system"),
    FAIL_400(400, "bad request"),
    NOT_FOUND(404, "not found"),
    NOT_REGISTERED(405, "not registered");

    private final int code;
    private final String desc;
}
