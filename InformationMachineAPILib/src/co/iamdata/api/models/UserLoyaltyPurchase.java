/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserLoyaltyPurchase 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5638102185504772836L;
    private List<LoyaltyPurchaseItemData> purchaseItems;
    private UserStore userStore;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("purchase_items")
    public List<LoyaltyPurchaseItemData> getPurchaseItems ( ) { 
        return this.purchaseItems;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("purchase_items")
    public void setPurchaseItems (List<LoyaltyPurchaseItemData> value) { 
        this.purchaseItems = value;
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
 