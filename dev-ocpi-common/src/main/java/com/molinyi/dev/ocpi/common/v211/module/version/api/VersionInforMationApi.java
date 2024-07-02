package com.molinyi.dev.ocpi.common.v211.module.version.api;

import com.dtflys.forest.annotation.ForestClient;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Header;
import com.dtflys.forest.annotation.Var;
import com.dtflys.forest.converter.json.ForestJacksonConverter;
import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.version.dto.Version;
import lombok.NonNull;

import java.util.List;

@ForestClient
public interface VersionInforMationApi {

    @Get(url = "{url}",dataType = "json",decoder = ForestJacksonConverter.class)
    ForestResponse<OcpiResponse<List<Version>>> get(@NonNull @Var("url") String versionsUrl, @NonNull @Header OcpiHttpHeader httpHeader);
}