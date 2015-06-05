/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCategoriesWrapper 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5064062067894967796L;
    private List<CategoryInfo> result;
    private MetaBase meta;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("result")
    public List<CategoryInfo> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("result")
    public void setResult (List<CategoryInfo> value) { 
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
 