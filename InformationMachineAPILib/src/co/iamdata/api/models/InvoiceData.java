/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class InvoiceData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5298309742361604786L;
    private Integer id;
    private String orderNumber;
    private String purchaseDate;
    private String receiptId;
    private String receiptImageUrl;
    private String recordedAt;
    private Integer storeId;
    private String storeName;
    private Double tax;
    private Double total;
    private Double totalWithoutTax;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public Integer getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (Integer value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("order_number")
    public String getOrderNumber ( ) { 
        return this.orderNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("order_number")
    public void setOrderNumber (String value) { 
        this.orderNumber = value;
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
    @JsonGetter("receipt_id")
    public String getReceiptId ( ) { 
        return this.receiptId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("receipt_id")
    public void setReceiptId (String value) { 
        this.receiptId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("receipt_image_url")
    public String getReceiptImageUrl ( ) { 
        return this.receiptImageUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("receipt_image_url")
    public void setReceiptImageUrl (String value) { 
        this.receiptImageUrl = value;
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
    @JsonGetter("tax")
    public Double getTax ( ) { 
        return this.tax;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tax")
    public void setTax (Double value) { 
        this.tax = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("total")
    public Double getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("total")
    public void setTotal (Double value) { 
        this.total = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("total_without_tax")
    public Double getTotalWithoutTax ( ) { 
        return this.totalWithoutTax;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("total_without_tax")
    public void setTotalWithoutTax (Double value) { 
        this.totalWithoutTax = value;
    }
 
}
 