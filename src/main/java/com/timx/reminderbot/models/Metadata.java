
package com.timx.reminderbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "intentId",
    "webhookUsed",
    "webhookForSlotFillingUsed",
    "intentName"
})
public class Metadata {

    @JsonProperty("intentId")
    public String intentId;
    @JsonProperty("webhookUsed")
    public String webhookUsed;
    @JsonProperty("webhookForSlotFillingUsed")
    public String webhookForSlotFillingUsed;
    @JsonProperty("intentName")
    public String intentName;

}
