/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProductIdentifiers 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5268140524751531073L;
    private List<String> plus;
    private List<String> upcs;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("plus")
    public List<String> getPlus ( ) { 
        return this.plus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("plus")
    public void setPlus (List<String> value) { 
        this.plus = value;
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
 