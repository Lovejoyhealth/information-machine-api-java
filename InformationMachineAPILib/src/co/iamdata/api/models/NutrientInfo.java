/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NutrientInfo 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5265384378315419862L;
    private String description;
    private Integer id;
    private String name;
    private String preferredUnitOfMeasurement;
    private Double recommendedDailyValue;
    private String unitOfMeasurement;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
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
    @JsonGetter("preferred_unit_of_measurement")
    public String getPreferredUnitOfMeasurement ( ) { 
        return this.preferredUnitOfMeasurement;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("preferred_unit_of_measurement")
    public void setPreferredUnitOfMeasurement (String value) { 
        this.preferredUnitOfMeasurement = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recommended_daily_value")
    public Double getRecommendedDailyValue ( ) { 
        return this.recommendedDailyValue;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recommended_daily_value")
    public void setRecommendedDailyValue (Double value) { 
        this.recommendedDailyValue = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("unit_of_measurement")
    public String getUnitOfMeasurement ( ) { 
        return this.unitOfMeasurement;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("unit_of_measurement")
    public void setUnitOfMeasurement (String value) { 
        this.unitOfMeasurement = value;
    }
 
}
 