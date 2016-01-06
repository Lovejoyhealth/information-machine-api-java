/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class PurchaseDataBuilder {
    //the instance to build
    private PurchaseData purchaseData;

    /**
     * Default constructor to initialize the instance
     */
    public PurchaseDataBuilder() {
        purchaseData = new PurchaseData();
    }

    public PurchaseDataBuilder invoices(List<InvoiceData> invoices) {
        purchaseData.setInvoices(invoices);
        return this;
    }

    public PurchaseDataBuilder purchasedItems(List<PurchasedItem> purchasedItems) {
        purchaseData.setPurchasedItems(purchasedItems);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PurchaseData build() {
        return purchaseData;
    }
}