package com.molinyi.dev.ocpi.common.v211.module.token.api;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.token.dto.AuthorizationInfo;
import com.molinyi.dev.ocpi.common.v211.module.token.dto.LocationReferences;
import com.molinyi.dev.ocpi.common.v211.module.token.dto.Token;
import com.molinyi.dev.ocpi.common.v211.module.token.dto.TokenType;
import lombok.NonNull;

import java.util.List;
import java.util.Map;

public interface TokenEMSPApi {

    @Get(url = "{url}")
    ForestResponse<OcpiResponse<List<Token>>> get(@NonNull @Var("url") String url,
                                                  @NonNull @Header OcpiHttpHeader httpHeader,
                                                  @Query Map<String, String> param);

    @Get(url = "{url}/{uId}")
    ForestResponse<OcpiResponse<Token>> get(@NonNull @Var("url") String url,
                                            @NonNull @Header OcpiHttpHeader httpHeader,
                                            @NonNull @Var("uId") String uId,
                                            @NonNull @Query("token_type") TokenType type);

    @Post(url = "{url}/{token_uid}/authorize?type={token_type}")
    ForestResponse<OcpiResponse<AuthorizationInfo>> post(@NonNull @Var("url") String url,
                                                         @NonNull @Header OcpiHttpHeader httpHeader,
                                                         @NonNull @Var("token_uid") String tokenUid,
                                                         @NonNull @Query("token_type") TokenType type,
                                                         @NonNull @JSONBody LocationReferences locationReferences);

    @Get(url = "{url}/{country_code}/{party_id}/{token_uid}")
    ForestResponse<OcpiResponse<Token>> get(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("country_code") String countryCode, @NonNull @Var("party_id") String partyId, @NonNull @Var("token_uid") String tokenUid);


}
