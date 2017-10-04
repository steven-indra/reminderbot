
package com.timx.reminderbot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiAiJSON {

    @JsonProperty("id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("result")
    private Result result;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("sessionId")
    private String sessionId;

}
