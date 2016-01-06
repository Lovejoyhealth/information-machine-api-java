/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetAllUserPurchasesWrapper 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4931185836862883324L;
    private MetaPaged meta;
    private List<UserPurchase> result;
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
    public List<UserPurchase> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("result")
    public void setResult (List<UserPurchase> value) { 
        this.result = value;
    }
 
}
 