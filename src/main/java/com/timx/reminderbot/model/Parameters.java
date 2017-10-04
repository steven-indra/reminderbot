
package com.timx.reminderbot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parameters {

    @JsonProperty("date-period")
    private String datePeriod;
    @JsonProperty("date-time")
    private String dateTime;
    @JsonProperty("event_type")
    private String eventType;
    @JsonProperty("reminders")
    private String reminders;
    @JsonProperty("location")
    private String location;

}
