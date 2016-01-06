/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetUserProducts 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5456585329483068911L;
    private MetaPaged meta;
    private List<ProductData> result;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("meta")
    public MetaPaged getMeta ( ) { 
        return this.meta;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("meta")
    public void setMeta (MetaPaged value) { 
        this.meta = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("result")
    public List<ProductData> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("result")
    public void setResult (List<ProductData> value) { 
        this.result = value;
    }
 
}
 