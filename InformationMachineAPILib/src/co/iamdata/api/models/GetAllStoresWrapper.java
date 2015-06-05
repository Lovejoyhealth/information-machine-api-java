/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetAllStoresWrapper 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5271644504618643787L;
    private List<UserStore> result;
    private MetaPaged meta;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("result")
    public List<UserStore> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("result")
    public void setResult (List<UserStore> value) { 
        this.result = value;
    }
 
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
 
}
 