/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Cart 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5663383096603301302L;
    private String cartId;
    private List<CartItem> cartItems;
    private String cartName;
    private String createdAt;
    private String updatedAt;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cart_id")
    public String getCartId ( ) { 
        return this.cartId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cart_id")
    public void setCartId (String value) { 
        this.cartId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cart_items")
    public List<CartItem> getCartItems ( ) { 
        return this.cartItems;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cart_items")
    public void setCartItems (List<CartItem> value) { 
        this.cartItems = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cart_name")
    public String getCartName ( ) { 
        return this.cartName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cart_name")
    public void setCartName (String value) { 
        this.cartName = value;
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
 