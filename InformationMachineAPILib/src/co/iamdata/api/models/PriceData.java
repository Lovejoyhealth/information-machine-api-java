/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PriceData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5116193794698914258L;
    private List<PriceInfo> prices;
    private Integer productId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("prices")
    public List<PriceInfo> getPrices ( ) { 
        return this.prices;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("prices")
    public void setPrices (List<PriceInfo> value) { 
        this.prices = value;
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
 
}
 