/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartItem 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4937955613236332091L;
    private String cartItemId;
    private String upc;
    private Integer quantity;
    private String createdAt;
    private String updatedAt;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cart_item_id")
    public String getCartItemId ( ) { 
        return this.cartItemId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cart_item_id")
    public void setCartItemId (String value) { 
        this.cartItemId = value;
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
    @JsonGetter("quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
    }
 
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
    @JsonGetter("updated_at")
    public String getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (String value) { 
        this.updatedAt = value;
    }
 
}
 