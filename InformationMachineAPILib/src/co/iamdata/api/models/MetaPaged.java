/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MetaPaged 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4672767135713951834L;
    private Integer page;
    private Integer perPage;
    private Integer totalCount;
    private String nextPage;
    private String lastPage;
    private Integer maxNumberOfRequestsPerMinute;
    private Integer remainingNumberOfRequest;
    private Double timeInEpochSecondTillReset;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("per_page")
    public Integer getPerPage ( ) { 
        return this.perPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("per_page")
    public void setPerPage (Integer value) { 
        this.perPage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("total_count")
    public Integer getTotalCount ( ) { 
        return this.totalCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("total_count")
    public void setTotalCount (Integer value) { 
        this.totalCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("next_page")
    public String getNextPage ( ) { 
        return this.nextPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("next_page")
    public void setNextPage (String value) { 
        this.nextPage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("last_page")
    public String getLastPage ( ) { 
        return this.lastPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("last_page")
    public void setLastPage (String value) { 
        this.lastPage = value;
    }
 
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
 