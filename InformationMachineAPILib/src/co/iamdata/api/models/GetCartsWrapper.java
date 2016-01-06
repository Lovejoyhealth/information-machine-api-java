/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCartsWrapper 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5425660365975543560L;
    private MetaBase meta;
    private List<Cart> result;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("meta")
    public MetaBase getMeta ( ) { 
        return this.meta;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("meta")
    public void setMeta (MetaBase value) { 
        this.meta = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("result")
    public List<Cart> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("result")
    public void setResult (List<Cart> value) { 
        this.result = value;
    }
 
}
 