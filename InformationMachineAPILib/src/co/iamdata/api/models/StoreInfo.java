/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StoreInfo 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4714743833876019007L;
    private Boolean canScrape;
    private Integer id;
    private String imageLink;
    private String name;
    private Boolean restaurant;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("can_scrape")
    public Boolean getCanScrape ( ) { 
        return this.canScrape;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("can_scrape")
    public void setCanScrape (Boolean value) { 
        this.canScrape = value;
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
    @JsonGetter("image_link")
    public String getImageLink ( ) { 
        return this.imageLink;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("image_link")
    public void setImageLink (String value) { 
        this.imageLink = value;
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
    @JsonGetter("restaurant")
    public Boolean getRestaurant ( ) { 
        return this.restaurant;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("restaurant")
    public void setRestaurant (Boolean value) { 
        this.restaurant = value;
    }
 
}
 