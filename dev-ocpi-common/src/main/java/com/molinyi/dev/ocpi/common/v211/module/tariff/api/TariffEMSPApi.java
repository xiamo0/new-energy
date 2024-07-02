package com.molinyi.dev.ocpi.common.v211.module.tariff.api;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.tariff.dto.Tariff;
import lombok.NonNull;


public interface TariffEMSPApi {

    @Get(url = "{url}/{country_code}/{party_id}/{tariff_id}")
    ForestResponse<OcpiResponse<Tariff>> get(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("country_code") String countryCode,
                                             @NonNull @Var("party_id") String partyId, @NonNull @Var("tariff_id") String tariffId);

    @Put(url = "{url}/{country_code}/{party_id}/{tariff_id}")
    ForestResponse<OcpiResponse<Tariff>> put(@Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Query("country_code") String countryCode,
                                             @NonNull @Query("party_id") String partyId, @NonNull @Query("tariff_id") String tariffId,
                                             @NonNull @JSONBody Tariff tariff);

    @Patch(url = "{url}/{country_code}/{party_id}/{tariff_id}")
    ForestResponse<OcpiResponse<Tariff>> patch(@Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Query("country_code") String countryCode,
                                               @NonNull @Query("party_id") String partyId, @NonNull @Query("tariff_id") String tariffId,
                                               @NonNull @JSONBody Tariff tariff);

    @Delete(url = "{url}/{country_code}/{party_id}/{tariff_id}")
    ForestResponse<OcpiResponse<Tariff>> delete(@Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Query("country_code") String countryCode, @NonNull @Query("party_id") String partyId, @NonNull @Query("tariff_id") String tariffId);

}

