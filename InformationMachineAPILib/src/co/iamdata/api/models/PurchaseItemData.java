/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PurchaseItemData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5175914956351712465L;
    private Double discountedPrice;
    private Integer id;
    private String name;
    private Double price;
    private ProductData product;
    private Integer purchaseId;
    private Double quantity;
    private String unitOfMeasurement;
    private String upc;
    private String upcResolvedAt;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("discounted_price")
    public Double getDiscountedPrice ( ) { 
        return this.discountedPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("discounted_price")
    public void setDiscountedPrice (Double value) { 
        this.discountedPrice = value;
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
    @JsonGetter("price")
    public Double getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("price")
    public void setPrice (Double value) { 
        this.price = value;
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
    @JsonGetter("purchase_id")
    public Integer getPurchaseId ( ) { 
        return this.purchaseId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("purchase_id")
    public void setPurchaseId (Integer value) { 
        this.purchaseId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("quantity")
    public Double getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("quantity")
    public void setQuantity (Double value) { 
        this.quantity = value;
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
 