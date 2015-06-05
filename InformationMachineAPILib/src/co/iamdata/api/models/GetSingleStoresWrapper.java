/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetSingleStoresWrapper 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5048058801984927304L;
    private GetSingleUserStoreResponse result;
    private MetaBase meta;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("result")
    public GetSingleUserStoreResponse getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("result")
    public void setResult (GetSingleUserStoreResponse value) { 
        this.result = value;
    }
 
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
 
}
 