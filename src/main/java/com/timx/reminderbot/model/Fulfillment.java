
package com.timx.reminderbot.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fulfillment {

    @JsonProperty("speech")
    private String speech;
    @JsonProperty("messages")
    private List<Message> messages = null;

}
