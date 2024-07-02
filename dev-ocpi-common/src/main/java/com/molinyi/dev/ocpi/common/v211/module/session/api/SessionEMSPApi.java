package com.molinyi.dev.ocpi.common.v211.module.session.api;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.session.dto.Session;
import lombok.NonNull;

import java.util.Map;

public interface SessionEMSPApi {

    @Get(url = "{url}/{countryCode}/{partyId}/{sessionId}")
    ForestResponse<OcpiResponse<Session>> get(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("countryCode") String countryCode, @NonNull @Var("partyId") String partyId, @NonNull @Var("sessionId") String sessionId);

    @Put(url = "{url}/{countryCode}/{partyId}/{sessionId}")
    ForestResponse<OcpiResponse<Session>> put(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("countryCode") String countryCode, @NonNull @Var("partyId") String partyId, @NonNull @Var("sessionId") String sessionId, @NonNull @JSONBody Session session);

    @Patch(url = "{url}/{countryCode}/{partyId}/{sessionId}")
    ForestResponse<OcpiResponse<Session>> patch(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("countryCode") String countryCode, @NonNull @Var("partyId") String partyId, @NonNull @Var("sessionId") String sessionId, @NonNull @JSONBody Map<String, Object> map);

}
