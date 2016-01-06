/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PurchaseData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5372948827188683244L;
    private List<InvoiceData> invoices;
    private List<PurchasedItem> purchasedItems;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("invoices")
    public List<InvoiceData> getInvoices ( ) { 
        return this.invoices;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("invoices")
    public void setInvoices (List<InvoiceData> value) { 
        this.invoices = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("purchased_items")
    public List<PurchasedItem> getPurchasedItems ( ) { 
        return this.purchasedItems;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("purchased_items")
    public void setPurchasedItems (List<PurchasedItem> value) { 
        this.purchasedItems = value;
    }
 
}
 