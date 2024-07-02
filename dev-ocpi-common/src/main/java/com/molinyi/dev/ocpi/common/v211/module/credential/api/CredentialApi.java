package com.molinyi.dev.ocpi.common.v211.module.credential.api;

import com.dtflys.forest.annotation.*;

import com.dtflys.forest.http.ForestResponse;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiHttpHeader;
import com.molinyi.dev.ocpi.common.v211.common.http.OcpiResponse;
import com.molinyi.dev.ocpi.common.v211.module.credential.dto.Credentials;
import lombok.NonNull;

import java.util.Map;

/**
 * The credentials module is used to exchange the credentials token that has to be used by parties for authorization of requests.
 * Every OCPI request is required to contain a credentials token in the HTTP Authorization header
 */
public interface CredentialApi {


    /**
     * Retrieves the credentials object to access the server’s platform. The request body is empty, the response contains the credentials
     * object to access the server’s platform. This credentials object also contains extra information about the server such as its business
     * details.
     *
     * @param credentialsUrl
     * @return
     */
    @Get(url = "{url}")
    ForestResponse<OcpiResponse<Credentials>> get(@NonNull @Var("url") String credentialsUrl, @NonNull @Header OcpiHttpHeader httpHeader);

    /**
     * Provides the server with credentials to access the client’s system. This credentials object also contains extra information about the
     * client such as its business details.
     * A POST initiates the registration process for this endpoint’s version. The server must also fetch the client’s endpoints for this
     * version.
     * If successful, the server must generate a new credentials token and respond with the client’s new credentials to access the server’s
     * system. The credentials object in the response also contains extra information about the server such as its business details.
     * This method MUST return a HTTP status code 405: method not allowed if the client has already been registered before.
     */
    @Post(url = "{url}")
    ForestResponse<OcpiResponse<Credentials>> post(@NonNull @Var("url") String credentialsUrl, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @JSONBody Credentials credentials);

    /**
     * Provides the server with updated credentials to access the client’s system. This credentials object also contains extra information
     * about the client such as its business details.
     * A PUT will switch to the version that contains this credentials endpoint if it’s different from the current version. The server must fetch
     * the client’s endpoints again, even if the version has not changed.
     * If successful, the server must generate a new credentials token for the client and respond with the client’s updated credentials to
     * access the server’s system. The credentials object in the response also contains extra information about the server such as its
     * business details.
     * This method MUST return a HTTP status code 405: method not allowed if the client has not been registered yet.
     */
    @Put(url = "{url}")
    ForestResponse<OcpiResponse<Credentials>> put(@NonNull @Var("url") String credentialsUrl, @NonNull @Header OcpiHttpHeader httpHeader, @NonNull @JSONBody Map<String, Object> param);

    /**
     * Informs the server that its credentials to access the client’s system are now invalid and can no longer be used. Both parties must
     * end any automated communication. This is the unregistration process.
     * This method MUST return a HTTP status code 405: method not allowed if the client has not been registered before.
     */
    @Delete(url = "{url}")
    ForestResponse<OcpiResponse<Credentials>> delete(@NonNull @Var("url") String credentialsUrl, @NonNull @Header OcpiHttpHeader httpHeader);

}
