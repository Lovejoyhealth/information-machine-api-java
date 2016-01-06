/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class LoyaltyPurchaseItemData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5610564745701554154L;
    private String createdAt;
    private Integer id;
    private String name;
    private ProductData product;
    private String upc;
    private String upcResolvedAt;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
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
    @JsonGetter("product")
    public ProductData getProduct ( ) { 
        return this.product;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("product")
    public void setProduct (ProductData value) { 
        this.product = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("upc")
    public String getUpc ( ) { 
        return this.upc;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("upc")
    public void setUpc (String value) { 
        this.upc = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("upc_resolved_at")
    public String getUpcResolvedAt ( ) { 
        return this.upcResolvedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("upc_resolved_at")
    public void setUpcResolvedAt (String value) { 
        this.upcResolvedAt = value;
    }
 
}
 