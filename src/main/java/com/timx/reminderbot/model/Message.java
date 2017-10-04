
package com.timx.reminderbot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {

    @JsonProperty("type")
    private long type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("speech")
    private String speech;

}
