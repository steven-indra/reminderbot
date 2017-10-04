
package com.timx.reminderbot.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

    @JsonProperty("source")
    private String source;
    @JsonProperty("resolvedQuery")
    private String resolvedQuery;
    @JsonProperty("action")
    private String action;
    @JsonProperty("actionIncomplete")
    private boolean actionIncomplete;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("contexts")
    private List<Object> contexts = null;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonProperty("score")
    private double score;

}
