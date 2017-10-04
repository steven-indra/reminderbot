
package com.timx.reminderbot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Status {

    @JsonProperty("code")
    private long code;
    @JsonProperty("errorType")
    private String errorType;

}
