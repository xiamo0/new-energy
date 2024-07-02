package com.molinyi.dev.ocpi.common.v211.module.cdr.api;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Header;
import com.dtflys.forest.annotation.Query;
import com.dtflys.forest.annotation.Var;
import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.cdr.dto.Cdr;
import lombok.NonNull;

import java.util.List;
import java.util.Map;


public interface CdrCPOApi {

    @Get(url = "{url}")
    ForestResponse<OcpiResponse<List<Cdr>>> get(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Query Map<String, String> param);


}
