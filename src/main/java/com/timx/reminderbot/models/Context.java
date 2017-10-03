
package com.timx.reminderbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "parameters",
    "lifespan"
})
public class Context {

    @JsonProperty("name")
    public String name;
    @JsonProperty("parameters")
    public Parameters_ parameters;
    @JsonProperty("lifespan")
    public long lifespan;

}
