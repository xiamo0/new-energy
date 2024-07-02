package com.molinyi.dev.ocpi.common.v211.module.cdr.api;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.cdr.dto.Cdr;
import lombok.NonNull;


public interface CdrEMSPApi {

    @Get(url = "{url}/{cdrId}")
    ForestResponse<OcpiResponse<Cdr>> get(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("cdrId") String cdrId);

    @Post(url = "{url}/{cdrId}")
    ForestResponse<OcpiResponse<Cdr>> post(@Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("cdrId") String cdrId, @NonNull @JSONBody Cdr cdr);

}

