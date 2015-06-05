/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetProductAlternativeTypesWrapper 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5145552730851597213L;
    private List<ProductAlternativeTypeInfo> result;
    private MetaBase meta;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("result")
    public List<ProductAlternativeTypeInfo> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("result")
    public void setResult (List<ProductAlternativeTypeInfo> value) { 
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
 