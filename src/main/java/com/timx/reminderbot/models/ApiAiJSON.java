
package com.timx.reminderbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "timestamp",
    "lang",
    "result",
    "status",
    "sessionId"
})
public class ApiAiJSON {

    @JsonProperty("id")
    public String id;
    @JsonProperty("timestamp")
    public String timestamp;
    @JsonProperty("lang")
    public String lang;
    @JsonProperty("result")
    public Result result;
    @JsonProperty("status")
    public Status status;
    @JsonProperty("sessionId")
    public String sessionId;

}
