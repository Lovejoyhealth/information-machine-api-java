/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NutrientData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5101277778819086196L;
    private Double dvp;
    private Integer id;
    private String name;
    private Double value;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("dvp")
    public Double getDvp ( ) { 
        return this.dvp;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("dvp")
    public void setDvp (Double value) { 
        this.dvp = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public Integer getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (Integer value) { 
        this.id = value;
    }
 
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
    @JsonGetter("value")
    public Double getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("value")
    public void setValue (Double value) { 
        this.value = value;
    }
 
}
 