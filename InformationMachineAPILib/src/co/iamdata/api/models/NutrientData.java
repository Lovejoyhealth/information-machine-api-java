/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NutrientData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5201284018180579385L;
    private Double dvp;
    private Double value;
    private String name;
    private Integer id;
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
 
}
 