/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PurchasedProduct 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5655615785089221774L;
    private Integer productId;
    private String date;
    private String store;
    private Double price;
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
    @JsonGetter("date")
    public String getDate ( ) { 
        return this.date;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("date")
    public void setDate (String value) { 
        this.date = value;
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
 
}
 