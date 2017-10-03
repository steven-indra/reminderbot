
package com.timx.reminderbot.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "confidence",
    "values",
    "value",
    "grain",
    "type"
})
public class Datetime {

    @JsonProperty("confidence")
    private Double confidence;
    @JsonProperty("values")
    private List<Value> values = null;
    @JsonProperty("value")
    private String value;
    @JsonProperty("grain")
    private String grain;
    @JsonProperty("type")
    private String type;

}
