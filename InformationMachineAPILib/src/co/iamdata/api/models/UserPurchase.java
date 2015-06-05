/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserPurchase 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4970882999172246808L;
    private UserStore userStore;
    private List<PurchaseItemData> purchaseItems;
    private Integer id;
    private String date;
    private Double total;
    private Double totalWithoutTax;
    private Double tax;
    private String orderNumber;
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
 
}
 