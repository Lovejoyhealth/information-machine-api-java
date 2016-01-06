/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MetaBase 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5267557986596356351L;
    private Integer maxNumberOfRequestsPerDay;
    private Integer remainingNumberOfRequest;
    private Double timeInEpochSecondTillReset;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("max_number_of_requests_per_day")
    public Integer getMaxNumberOfRequestsPerDay ( ) { 
        return this.maxNumberOfRequestsPerDay;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("max_number_of_requests_per_day")
    public void setMaxNumberOfRequestsPerDay (Integer value) { 
        this.maxNumberOfRequestsPerDay = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("remaining_number_of_request")
    public Integer getRemainingNumberOfRequest ( ) { 
        return this.remainingNumberOfRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("remaining_number_of_request")
    public void setRemainingNumberOfRequest (Integer value) { 
        this.remainingNumberOfRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("time_in_epoch_second_till_reset")
    public Double getTimeInEpochSecondTillReset ( ) { 
        return this.timeInEpochSecondTillReset;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("time_in_epoch_second_till_reset")
    public void setTimeInEpochSecondTillReset (Double value) { 
        this.timeInEpochSecondTillReset = value;
    }
 
}
 