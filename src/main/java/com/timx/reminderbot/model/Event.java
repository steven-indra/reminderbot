
package com.timx.reminderbot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "confidence",
    "value",
    "type"
})
public class Event {

    @JsonProperty("confidence")
    private Double confidence;
    @JsonProperty("value")
    private String value;
    @JsonProperty("type")
    private String type;

}
