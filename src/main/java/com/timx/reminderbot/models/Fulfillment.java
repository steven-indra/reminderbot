
package com.timx.reminderbot.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speech",
    "messages"
})
public class Fulfillment {

    @JsonProperty("speech")
    public String speech;
    @JsonProperty("messages")
    public List<Message> messages = null;

}
