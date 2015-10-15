/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class PurchaseItemDataBuilder {
    //the instance to build
    private PurchaseItemData purchaseItemData;

    /**
     * Default constructor to initialize the instance
     */
    public PurchaseItemDataBuilder() {
        purchaseItemData = new PurchaseItemData();
    }

    public PurchaseItemDataBuilder discountedPrice(Double discountedPrice) {
        purchaseItemData.setDiscountedPrice(discountedPrice);
        return this;
    }

    public PurchaseItemDataBuilder id(Integer id) {
        purchaseItemData.setId(id);
        return this;
    }

    public PurchaseItemDataBuilder name(String name) {
        purchaseItemData.setName(name);
        return this;
    }

    public PurchaseItemDataBuilder price(Double price) {
        purchaseItemData.setPrice(price);
        return this;
    }

    public PurchaseItemDataBuilder product(PurchaseItemProduct product) {
        purchaseItemData.setProduct(product);
        return this;
    }

    public PurchaseItemDataBuilder purchaseId(Integer purchaseId) {
        purchaseItemData.setPurchaseId(purchaseId);
        return this;
    }

    public PurchaseItemDataBuilder quantity(Double quantity) {
        purchaseItemData.setQuantity(quantity);
        return this;
    }

    public PurchaseItemDataBuilder unitOfMeasurement(String unitOfMeasurement) {
        purchaseItemData.setUnitOfMeasurement(unitOfMeasurement);
        return this;
    }

    public PurchaseItemDataBuilder upc(String upc) {
        purchaseItemData.setUpc(upc);
        return this;
    }

    public PurchaseItemDataBuilder upcResolvedAt(String upcResolvedAt) {
        purchaseItemData.setUpcResolvedAt(upcResolvedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PurchaseItemData build() {
        return purchaseItemData;
    }
}