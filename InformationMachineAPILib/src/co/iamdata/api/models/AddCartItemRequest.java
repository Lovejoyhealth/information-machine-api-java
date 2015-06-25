/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddCartItemRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5395606232767318287L;
    private String upc;
    private int quantity;
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
    public int getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("quantity")
    public void setQuantity (int value) { 
        this.quantity = value;
    }
 
}
 