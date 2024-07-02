package com.molinyi.dev.ocpi.common.v211.module.token.api;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.token.dto.Token;
import lombok.NonNull;

import java.util.Map;

public interface TokenCPOApi {

    @Get(url = "{url}/{country_code}/{party_id}/{token_uid}")
    ForestResponse<OcpiResponse<Token>> get(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("country_code") String countryCode, @NonNull @Var("party_id") String partyId, @NonNull @Var("token_uid") String tokenUid);

    @Put(url = "{url}/{country_code}/{party_id}/{token_uid}")
    ForestResponse<OcpiResponse<Token>> post(@Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("country_code") String countryCode, @NonNull @Var("party_id") String partyId, @NonNull @Var("token_uid") String tokenUid, @NonNull @JSONBody Token token);

    @Patch(url = "{url}/{country_code}/{party_id}/{token_uid}")
    ForestResponse<OcpiResponse<Token>> patch(@Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("country_code") String countryCode, @NonNull @Var("party_id") String partyId, @NonNull @Var("token_uid") String tokenUid, @NonNull @JSONBody Map<String, Object> token);


}
