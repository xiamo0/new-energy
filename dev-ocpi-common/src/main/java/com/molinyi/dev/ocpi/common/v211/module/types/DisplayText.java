package com.molinyi.dev.ocpi.common.v211.module.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisplayText {
    
    //2个字节
    @NonNull
    private String language;

    //512 bytes
    @NonNull
    private String text;

}
