package com.molinyi.dev.ocpi.common.v211.module.session.api;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.session.dto.Session;
import lombok.NonNull;

import java.util.List;
import java.util.Map;


public interface SessionCPOApi {

    @Get(url = "{url}")
    ForestResponse<OcpiResponse<List<Session>>> get(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Query Map<String, String> request);

}
