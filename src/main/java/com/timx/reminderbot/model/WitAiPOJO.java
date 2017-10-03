
package com.timx.reminderbot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "msg_id",
    "_text",
    "entities"
})
public class WitAiPOJO {

    @JsonProperty("msg_id")
    private String msgId;
    @JsonProperty("_text")
    private String text;
    @JsonProperty("entities")
    private Entities entities;

}
