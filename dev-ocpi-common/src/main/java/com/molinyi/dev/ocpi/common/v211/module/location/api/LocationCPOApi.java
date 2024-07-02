package com.molinyi.dev.ocpi.common.v211.module.location.api;

import com.dtflys.forest.annotation.*;
import lombok.NonNull;

import java.util.List;
import java.util.Map;

@ForestClient
public interface LocationCPOApi {

    @Get(url = "{url}")
    ForestResponse<OcpiResponse<List<Location>>> get(@NonNull @Var("url") String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Query Map<String, String> request);

    @Get(url = "{url}/{localtionId}")
    ForestResponse<OcpiResponse<Location>> get(@Var("url") String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("localtionId") String localtionId);

    @Get(url = "{url}/{localtionId}/{evseUid}")
    ForestResponse<OcpiResponse<EVSE>> get(@Var("url") String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("localtionId") String localtionId, @NonNull @Var("evseUid") String evseUid);

    @Get(url = "{url}/{localtionId}/{evseUid}/{connectorId}")
    ForestResponse<OcpiResponse<Connector>> get(@Var("url") String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("localtionId") String localtionId, @NonNull @Var("evseUid") String evseUid, @NonNull @Var("connectorId") String connectorId);

}
