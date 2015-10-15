/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class LoyaltyPurchaseItemDataBuilder {
    //the instance to build
    private LoyaltyPurchaseItemData loyaltyPurchaseItemData;

    /**
     * Default constructor to initialize the instance
     */
    public LoyaltyPurchaseItemDataBuilder() {
        loyaltyPurchaseItemData = new LoyaltyPurchaseItemData();
    }

    public LoyaltyPurchaseItemDataBuilder id(Integer id) {
        loyaltyPurchaseItemData.setId(id);
        return this;
    }

    public LoyaltyPurchaseItemDataBuilder name(String name) {
        loyaltyPurchaseItemData.setName(name);
        return this;
    }

    public LoyaltyPurchaseItemDataBuilder product(PurchaseItemProduct product) {
        loyaltyPurchaseItemData.setProduct(product);
        return this;
    }

    public LoyaltyPurchaseItemDataBuilder upc(String upc) {
        loyaltyPurchaseItemData.setUpc(upc);
        return this;
    }

    public LoyaltyPurchaseItemDataBuilder upcResolvedAt(String upcResolvedAt) {
        loyaltyPurchaseItemData.setUpcResolvedAt(upcResolvedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LoyaltyPurchaseItemData build() {
        return loyaltyPurchaseItemData;
    }
}