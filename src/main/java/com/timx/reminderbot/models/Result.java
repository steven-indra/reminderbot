
package com.timx.reminderbot.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source",
    "resolvedQuery",
    "action",
    "actionIncomplete",
    "parameters",
    "contexts",
    "metadata",
    "fulfillment",
    "score"
})
public class Result {

    @JsonProperty("source")
    public String source;
    @JsonProperty("resolvedQuery")
    public String resolvedQuery;
    @JsonProperty("action")
    public String action;
    @JsonProperty("actionIncomplete")
    public boolean actionIncomplete;
    @JsonProperty("parameters")
    public Parameters parameters;
    @JsonProperty("contexts")
    public List<Context> contexts = null;
    @JsonProperty("metadata")
    public Metadata metadata;
    @JsonProperty("fulfillment")
    public Fulfillment fulfillment;
    @JsonProperty("score")
    public double score;

}
