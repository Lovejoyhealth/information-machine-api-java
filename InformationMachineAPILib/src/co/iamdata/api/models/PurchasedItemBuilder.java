/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class PurchasedItemBuilder {
    //the instance to build
    private PurchasedItem purchasedItem;

    /**
     * Default constructor to initialize the instance
     */
    public PurchasedItemBuilder() {
        purchasedItem = new PurchasedItem();
    }

    public PurchasedItemBuilder name(String name) {
        purchasedItem.setName(name);
        return this;
    }

    public PurchasedItemBuilder productDetails(ProductData productDetails) {
        purchasedItem.setProductDetails(productDetails);
        return this;
    }

    public PurchasedItemBuilder productId(Integer productId) {
        purchasedItem.setProductId(productId);
        return this;
    }

    public PurchasedItemBuilder productIdentifiers(ProductIdentifiers productIdentifiers) {
        purchasedItem.setProductIdentifiers(productIdentifiers);
        return this;
    }

    public PurchasedItemBuilder productTimestamps(ProductTimestamps productTimestamps) {
        purchasedItem.setProductTimestamps(productTimestamps);
        return this;
    }

    public PurchasedItemBuilder purchaseHistory(List<PurchaseInfo> purchaseHistory) {
        purchasedItem.setPurchaseHistory(purchaseHistory);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PurchasedItem build() {
        return purchasedItem;
    }
}