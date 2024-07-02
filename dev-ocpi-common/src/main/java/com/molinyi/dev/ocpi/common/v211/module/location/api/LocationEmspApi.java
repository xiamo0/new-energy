package com.molinyi.dev.ocpi.common.v211.module.location.api;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestResponse;
import com.infypower.fycev.ocpi.v211.module.location.dto.Location;
import com.infypower.fycev.ocpi.v211.module.location.dto.Connector;
import com.infypower.fycev.ocpi.v211.module.location.dto.EVSE;
import com.infypower.fycev.ocpi.v211.common.http.OcpiHttpHeader;
import com.infypower.fycev.ocpi.v211.common.http.OcpiResponse;
import lombok.NonNull;

import java.util.Map;

@ForestClient
public interface LocationEmspApi {
    @Get(url = "{url}/{countryCode}/{partyId}/{locationId}")
    ForestResponse<OcpiResponse<Location>> get(@Var("url") @NonNull String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @Var("countryCode") @NonNull String countryCode, @Var("partyId") @NonNull String partyId, @Var("locationId") @NonNull String locationId);

    @Get(url = "{url}/{countryCode}/{partyId}/{locationId}/{evseUid}")
    ForestResponse<OcpiResponse<EVSE>> get(@Var("url") @NonNull String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @Var("countryCode") @NonNull String countryCode, @Var("partyId") @NonNull String partyId, @Var("locationId") @NonNull String locationId, @Var("evseUid") @NonNull String evseUid);

    @Get(url = "{url}/{countryCode}/{partyId}/{locationId}/{evseUid}/{connectorId}")
    ForestResponse<OcpiResponse<Connector>> get(@Var("url") @NonNull String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @Var("countryCode") @NonNull String countryCode, @Var("partyId") @NonNull String partyId, @Var("locationId") @NonNull String locationId, @Var("evseUid") @NonNull String evseUid, @Var("connectorId") @NonNull String connectorId);


    @Put(url = "{url}/{countryCode}/{partyId}/{locationId}")
    ForestResponse<OcpiResponse<Location>> put(@Var("url") @NonNull String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @Var("countryCode") @NonNull String countryCode, @Var("partyId") @NonNull String partyId, @Var("locationId") @NonNull String locationId, @JSONBody @NonNull Location location);


    @Put(url = "{url}/{countryCode}/{partyId}/{locationId}/{evseUid}")
    ForestResponse<OcpiResponse<EVSE>> put(@Var("url") @NonNull String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @Var("countryCode") @NonNull String countryCode, @Var("partyId") @NonNull String partyId, @Var("locationId") @NonNull String locationId, @Var("evseUid") @NonNull String evseUid, @JSONBody @NonNull EVSE evse);

    @Put(url = "{url}/{countryCode}/{partyId}/{locationId}/{evseUid}/{connectorId}")
    ForestResponse<OcpiResponse<Connector>> put(@Var("url") @NonNull String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @Var("countryCode") @NonNull String countryCode, @Var("partyId") @NonNull String partyId, @Var("locationId") @NonNull String locationId, @Var("evseUid") @NonNull String evseUid, @Var("connectorId") @NonNull String connectorId, @JSONBody @NonNull Connector connector);


    @Patch(url = "{url}/{countryCode}/{partyId}/{locationId}")
    ForestResponse<OcpiResponse<Location>> patch(@Var("url") @NonNull String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @Var("countryCode") @NonNull String countryCode, @Var("partyId") @NonNull String partyId, @Var("locationId") @NonNull String locationId, @JSONBody @NonNull Map param);


    @Patch(url = "{url}/{countryCode}/{partyId}/{locationId}/{evseUid}")
    ForestResponse<OcpiResponse<EVSE>> patch(@Var("url") @NonNull String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @Var("countryCode") @NonNull String countryCode, @Var("partyId") @NonNull String partyId, @Var("locationId") @NonNull String locationId, @Var("evseUid") @NonNull String evseUid, @JSONBody @NonNull Map param);

    @Patch(url = "{url}/{countryCode}/{partyId}/{locationId}/{evseUid}/{connectorId}")
    ForestResponse<OcpiResponse<Connector>> patch(@Var("url") @NonNull String locationUrl, @NonNull @Header OcpiHttpHeader httpHeader, @Var("countryCode") @NonNull String countryCode, @Var("partyId") @NonNull String partyId, @Var("locationId") @NonNull String locationId, @Var("evseUid") @NonNull String evseUid, @Var("connectorId") @NonNull String connectorId, @JSONBody @NonNull Map param);


}
