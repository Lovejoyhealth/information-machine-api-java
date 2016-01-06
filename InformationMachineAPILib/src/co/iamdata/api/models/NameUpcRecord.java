/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NameUpcRecord 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5101951936510212731L;
    private String name;
    private String resolveStatus;
    private String store;
    private List<String> upcs;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("resolve_status")
    public String getResolveStatus ( ) { 
        return this.resolveStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("resolve_status")
    public void setResolveStatus (String value) { 
        this.resolveStatus = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("store")
    public String getStore ( ) { 
        return this.store;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("store")
    public void setStore (String value) { 
        this.store = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("upcs")
    public List<String> getUpcs ( ) { 
        return this.upcs;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("upcs")
    public void setUpcs (List<String> value) { 
        this.upcs = value;
    }
 
}
 