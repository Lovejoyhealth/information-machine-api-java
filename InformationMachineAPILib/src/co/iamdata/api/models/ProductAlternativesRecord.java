/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProductAlternativesRecord 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5295720077724844497L;
    private List<ProductData> productAlternatives;
    private Integer productId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("productAlternatives")
    public List<ProductData> getProductAlternatives ( ) { 
        return this.productAlternatives;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("productAlternatives")
    public void setProductAlternatives (List<ProductData> value) { 
        this.productAlternatives = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("productId")
    public Integer getProductId ( ) { 
        return this.productId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("productId")
    public void setProductId (Integer value) { 
        this.productId = value;
    }
 
}
 