/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProductAlternativesRecord 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4923283523001916253L;
    private Integer productId;
    private List<ProductData> productAlternatives;
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
 
}
 