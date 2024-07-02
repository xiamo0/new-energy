package com.molinyi.dev.ocpi.common.v211.common.http;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ocpi 相关api响应状态码
 */
@Getter
@AllArgsConstructor
public enum OcpIStatusCode {

    SUCCESS(1000, "success"),

    CLIENT_ERROR_2000(2000, "generic client error"),
    CLIENT_ERROR_2001(2001, "invalid or missing parameters"),
    CLIENT_ERROR_2002(2002, "not enough information"),
    CLIENT_ERROR_2003(2003, "unknown location"),

    SERVER_ERROR_3000(3000, "generic server error"),
    SERVER_ERROR_3001(3001, "unable to use the client’s api."),
    SERVER_ERROR_3002(3002, "unsupported version"),
    SERVER_ERROR_3003(3003, "no matching endpoints or expected endpoints missing between parties");

    private final int code;
    private final String desc;

    public static boolean isSuccess(int statusCode){
        return statusCode >= 1000 && statusCode < 2000;
    }
    public static boolean isClientError(int statusCode) {
        return statusCode >= 2000 && statusCode < 3000;
    }

    public static boolean isServerError(int statusCode) {
        return statusCode >= 3000 && statusCode < 4000;
    }

}
