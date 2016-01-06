/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class PurchaseInfoBuilder {
    //the instance to build
    private PurchaseInfo purchaseInfo;

    /**
     * Default constructor to initialize the instance
     */
    public PurchaseInfoBuilder() {
        purchaseInfo = new PurchaseInfo();
    }

    public PurchaseInfoBuilder harvestedName(String harvestedName) {
        purchaseInfo.setHarvestedName(harvestedName);
        return this;
    }

    public PurchaseInfoBuilder invoiceId(Integer invoiceId) {
        purchaseInfo.setInvoiceId(invoiceId);
        return this;
    }

    public PurchaseInfoBuilder price(Double price) {
        purchaseInfo.setPrice(price);
        return this;
    }

    public PurchaseInfoBuilder purchaseDate(String purchaseDate) {
        purchaseInfo.setPurchaseDate(purchaseDate);
        return this;
    }

    public PurchaseInfoBuilder quantity(Double quantity) {
        purchaseInfo.setQuantity(quantity);
        return this;
    }

    public PurchaseInfoBuilder recordedAt(String recordedAt) {
        purchaseInfo.setRecordedAt(recordedAt);
        return this;
    }

    public PurchaseInfoBuilder storeId(Integer storeId) {
        purchaseInfo.setStoreId(storeId);
        return this;
    }

    public PurchaseInfoBuilder storeName(String storeName) {
        purchaseInfo.setStoreName(storeName);
        return this;
    }

    public PurchaseInfoBuilder unitPrice(Double unitPrice) {
        purchaseInfo.setUnitPrice(unitPrice);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PurchaseInfo build() {
        return purchaseInfo;
    }
}