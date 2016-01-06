/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProductTimestamps 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5331275829948550864L;
    private String recordedAt;
    private String upcResolvedAt;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recorded_at")
    public String getRecordedAt ( ) { 
        return this.recordedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recorded_at")
    public void setRecordedAt (String value) { 
        this.recordedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("upc_resolved_at")
    public String getUpcResolvedAt ( ) { 
        return this.upcResolvedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("upc_resolved_at")
    public void setUpcResolvedAt (String value) { 
        this.upcResolvedAt = value;
    }
 
}
 