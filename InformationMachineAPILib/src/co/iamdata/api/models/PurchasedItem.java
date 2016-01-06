/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PurchasedItem 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5608780519600554710L;
    private String name;
    private ProductData productDetails;
    private Integer productId;
    private ProductIdentifiers productIdentifiers;
    private ProductTimestamps productTimestamps;
    private List<PurchaseInfo> purchaseHistory;
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
    @JsonGetter("product_details")
    public ProductData getProductDetails ( ) { 
        return this.productDetails;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("product_details")
    public void setProductDetails (ProductData value) { 
        this.productDetails = value;
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
    @JsonGetter("product_identifiers")
    public ProductIdentifiers getProductIdentifiers ( ) { 
        return this.productIdentifiers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("product_identifiers")
    public void setProductIdentifiers (ProductIdentifiers value) { 
        this.productIdentifiers = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("product_timestamps")
    public ProductTimestamps getProductTimestamps ( ) { 
        return this.productTimestamps;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("product_timestamps")
    public void setProductTimestamps (ProductTimestamps value) { 
        this.productTimestamps = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("purchase_history")
    public List<PurchaseInfo> getPurchaseHistory ( ) { 
        return this.purchaseHistory;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("purchase_history")
    public void setPurchaseHistory (List<PurchaseInfo> value) { 
        this.purchaseHistory = value;
    }
 
}
 