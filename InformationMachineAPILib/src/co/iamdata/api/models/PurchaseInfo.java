/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PurchaseInfo 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5249215838435013708L;
    private String harvestedName;
    private Integer invoiceId;
    private Double price;
    private String purchaseDate;
    private Double quantity;
    private String recordedAt;
    private Integer storeId;
    private String storeName;
    private Double unitPrice;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("harvested_name")
    public String getHarvestedName ( ) { 
        return this.harvestedName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("harvested_name")
    public void setHarvestedName (String value) { 
        this.harvestedName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("invoice_id")
    public Integer getInvoiceId ( ) { 
        return this.invoiceId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("invoice_id")
    public void setInvoiceId (Integer value) { 
        this.invoiceId = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("purchase_date")
    public String getPurchaseDate ( ) { 
        return this.purchaseDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("purchase_date")
    public void setPurchaseDate (String value) { 
        this.purchaseDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("quantity")
    public Double getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("quantity")
    public void setQuantity (Double value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recorded_at")
    public String getRecordedAt ( ) { 
        return this.recordedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recorded_at")
    public void setRecordedAt (String value) { 
        this.recordedAt = value;
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
    @JsonGetter("store_name")
    public String getStoreName ( ) { 
        return this.storeName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("store_name")
    public void setStoreName (String value) { 
        this.storeName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("unit_price")
    public Double getUnitPrice ( ) { 
        return this.unitPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("unit_price")
    public void setUnitPrice (Double value) { 
        this.unitPrice = value;
    }
 
}
 