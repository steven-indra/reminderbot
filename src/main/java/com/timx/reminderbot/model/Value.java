
package com.timx.reminderbot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "grain",
    "type"
})
public class Value {

    @JsonProperty("value")
    private String value;
    @JsonProperty("grain")
    private String grain;
    @JsonProperty("type")
    private String type;

}
