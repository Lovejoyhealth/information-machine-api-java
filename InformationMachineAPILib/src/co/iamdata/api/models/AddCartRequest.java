/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddCartRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4892825263949793728L;
    private String cartName;
    private String description;
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
 
}
 