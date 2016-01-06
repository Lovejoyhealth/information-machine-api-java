/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserPurchase 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5172307608518895349L;
    private String date;
    private Integer id;
    private String orderNumber;
    private List<PurchaseItemData> purchaseItems;
    private String receiptId;
    private String receiptImageUrl;
    private Double tax;
    private Double total;
    private Double totalWithoutTax;
    private UserStore userStore;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("date")
    public String getDate ( ) { 
        return this.date;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("date")
    public void setDate (String value) { 
        this.date = value;
    }
 
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
    @JsonGetter("purchase_items")
    public List<PurchaseItemData> getPurchaseItems ( ) { 
        return this.purchaseItems;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("purchase_items")
    public void setPurchaseItems (List<PurchaseItemData> value) { 
        this.purchaseItems = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("user_store")
    public UserStore getUserStore ( ) { 
        return this.userStore;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("user_store")
    public void setUserStore (UserStore value) { 
        this.userStore = value;
    }
 
}
 