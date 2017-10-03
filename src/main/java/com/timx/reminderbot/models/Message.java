
package com.timx.reminderbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "speech"
})
public class Message {

    @JsonProperty("type")
    public long type;
    @JsonProperty("id")
    public String id;
    @JsonProperty("speech")
    public String speech;

}
