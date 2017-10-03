
package com.timx.reminderbot.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "event",
    "datetime",
    "intent"
})
public class Entities {

    @JsonProperty("event")
    private List<Event> event = null;
    @JsonProperty("datetime")
    private List<Datetime> datetime = null;
    @JsonProperty("intent")
    private List<Intent> intent = null;

}
