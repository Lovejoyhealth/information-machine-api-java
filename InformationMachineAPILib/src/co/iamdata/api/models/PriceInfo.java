/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PriceInfo 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5708862932919377678L;
    private Double price;
    private Integer productId;
    private Integer storeId;
    private String storeIdentifier;
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
    @JsonGetter("product_id")
    public Integer getProductId ( ) { 
        return this.productId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("product_id")
    public void setProductId (Integer value) { 
        this.productId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("store_id")
    public Integer getStoreId ( ) { 
        return this.storeId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("store_id")
    public void setStoreId (Integer value) { 
        this.storeId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("store_identifier")
    public String getStoreIdentifier ( ) { 
        return this.storeIdentifier;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("store_identifier")
    public void setStoreIdentifier (String value) { 
        this.storeIdentifier = value;
    }
 
}
 