/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MetaBase 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4981507652194938603L;
    private Integer maxNumberOfRequestsPerMinute;
    private Integer remainingNumberOfRequest;
    private Double timeInEpochSecondTillReset;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("max_number_of_requests_per_minute")
    public Integer getMaxNumberOfRequestsPerMinute ( ) { 
        return this.maxNumberOfRequestsPerMinute;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("max_number_of_requests_per_minute")
    public void setMaxNumberOfRequestsPerMinute (Integer value) { 
        this.maxNumberOfRequestsPerMinute = value;
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
 