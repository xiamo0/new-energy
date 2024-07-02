package com.molinyi.dev.ocpi.common.v211.module.command.api;

import com.dtflys.forest.annotation.Header;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Post;
import com.dtflys.forest.annotation.Var;
import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.command.dto.CommandResponse;
import com.molinyi.dev.ocpi.common.v211.module.command.dto.CommandType;
import lombok.NonNull;


public interface CommandCPOApi<T> {

    @Post(url = "{url}/{command}")
    ForestResponse<OcpiResponse<CommandResponse>> post(@NonNull @Var("url") String url, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @Var("command") CommandType command, @NonNull @JSONBody T t);
}
