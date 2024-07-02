package com.molinyi.dev.ocpi.common.v211.common.http;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

@Data
@NoArgsConstructor
public class OcpiHttpHeader {

    public static final String AUTHORIZATION = "Authorization";
    public static final String OCPI_FROM_COUNTRY_CODE = "OCPI-from-country-code";//发送方的 国家代码

    public static final String X_REQUEST_ID = "X-Request-ID";//每个请求都应包含一个唯一的请求 ID，对该请求的响应也应包含相同的 ID
    public static final String X_CORRELATION_ID = "X-Correlation-ID";//每个请求/响应都必须包含一个唯一的相关 ID，对该请求的每个响应都必须包含相同的 ID
    public static final String OCPI_TO_PARTY_ID = "OCPI-to-party-id";//连接方 ID
    public static final String OCPI_TO_COUNTRY_CODE = "OCPI-to-country-code";//连接方的 国家代码
    public static final String OCPI_FROM_PARTY_ID = "OCPI-from-party-id";//发送方 ID


    public static final String CONTENT_TYPE = "Content-Type";


    @NonNull
    @JSONField(name = AUTHORIZATION)
    private String authorization;

    @NonNull
    @JSONField(name = CONTENT_TYPE)
    private String contentType;

    @JSONField(name = X_REQUEST_ID)
    private String xRequestID;

    @JSONField(name = X_CORRELATION_ID)
    private String xCorrelationID;

    @JSONField(name = OCPI_TO_PARTY_ID)
    private String ocpiToPartyId;

    @JSONField(name = OCPI_TO_COUNTRY_CODE)
    private String ocpiToCountryCode;

    @JSONField(name = OCPI_FROM_PARTY_ID)
    private String ocpiFromPartyId;

    @JSONField(name = OCPI_FROM_COUNTRY_CODE)
    private String ocpiFromCountryCode;


    public static String getBasicAuth(String pass) {
        return "Token " + Base64.getEncoder().encodeToString(pass.getBytes(StandardCharsets.UTF_8));
    }

    public static String defaultXRequestID() {
        return UUID.randomUUID().toString();
    }

    public static String defaultXCorrelationID() {
        return UUID.randomUUID().toString();
    }

    public static String defaultContentType() {
        return "application/json";
    }

    public static OcpiHttpHeader defaultHttpHeader(@NonNull String fromPartyId, @NonNull String fromCountryCode, @NonNull String toPartyId, @NonNull String toCountryCode, @NonNull String token) {
        final OcpiHttpHeader header = new OcpiHttpHeader();
        header.setOcpiFromCountryCode(fromCountryCode);
        header.setOcpiFromPartyId(fromPartyId);
        header.setOcpiToPartyId(toPartyId);
        header.setOcpiToCountryCode(toCountryCode);
        header.setContentType(OcpiHttpHeader.defaultContentType());
        header.setAuthorization(OcpiHttpHeader.getBasicAuth(token));
        header.setXRequestID(OcpiHttpHeader.defaultXRequestID());
        header.setXCorrelationID(OcpiHttpHeader.defaultXCorrelationID());
        return header;
    }

}
