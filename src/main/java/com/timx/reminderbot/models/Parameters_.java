
package com.timx.reminderbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "all",
    "time.original",
    "date.original",
    "date-period.original",
    "holiday",
    "recurrence",
    "alarm-name.original",
    "holiday.original",
    "time-period.original",
    "time-period",
    "time",
    "all.original",
    "recurrence.original",
    "date-period",
    "alarm-name"
})
public class Parameters_ {

    @JsonProperty("date")
    public String date;
    @JsonProperty("all")
    public String all;
    @JsonProperty("time.original")
    public String timeOriginal;
    @JsonProperty("date.original")
    public String dateOriginal;
    @JsonProperty("date-period.original")
    public String datePeriodOriginal;
    @JsonProperty("holiday")
    public String holiday;
    @JsonProperty("recurrence")
    public String recurrence;
    @JsonProperty("alarm-name.original")
    public String alarmNameOriginal;
    @JsonProperty("holiday.original")
    public String holidayOriginal;
    @JsonProperty("time-period.original")
    public String timePeriodOriginal;
    @JsonProperty("time-period")
    public String timePeriod;
    @JsonProperty("time")
    public String time;
    @JsonProperty("all.original")
    public String allOriginal;
    @JsonProperty("recurrence.original")
    public String recurrenceOriginal;
    @JsonProperty("date-period")
    public String datePeriod;
    @JsonProperty("alarm-name")
    public String alarmName;

}
