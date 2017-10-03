
package com.timx.reminderbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "errorType"
})
public class Status {

    @JsonProperty("code")
    public long code;
    @JsonProperty("errorType")
    public String errorType;

}
