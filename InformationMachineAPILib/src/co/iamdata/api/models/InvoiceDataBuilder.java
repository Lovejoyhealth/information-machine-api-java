/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class InvoiceDataBuilder {
    //the instance to build
    private InvoiceData invoiceData;

    /**
     * Default constructor to initialize the instance
     */
    public InvoiceDataBuilder() {
        invoiceData = new InvoiceData();
    }

    public InvoiceDataBuilder id(Integer id) {
        invoiceData.setId(id);
        return this;
    }

    public InvoiceDataBuilder orderNumber(String orderNumber) {
        invoiceData.setOrderNumber(orderNumber);
        return this;
    }

    public InvoiceDataBuilder purchaseDate(String purchaseDate) {
        invoiceData.setPurchaseDate(purchaseDate);
        return this;
    }

    public InvoiceDataBuilder receiptId(String receiptId) {
        invoiceData.setReceiptId(receiptId);
        return this;
    }

    public InvoiceDataBuilder receiptImageUrl(String receiptImageUrl) {
        invoiceData.setReceiptImageUrl(receiptImageUrl);
        return this;
    }

    public InvoiceDataBuilder recordedAt(String recordedAt) {
        invoiceData.setRecordedAt(recordedAt);
        return this;
    }

    public InvoiceDataBuilder storeId(Integer storeId) {
        invoiceData.setStoreId(storeId);
        return this;
    }

    public InvoiceDataBuilder storeName(String storeName) {
        invoiceData.setStoreName(storeName);
        return this;
    }

    public InvoiceDataBuilder tax(Double tax) {
        invoiceData.setTax(tax);
        return this;
    }

    public InvoiceDataBuilder total(Double total) {
        invoiceData.setTotal(total);
        return this;
    }

    public InvoiceDataBuilder totalWithoutTax(Double totalWithoutTax) {
        invoiceData.setTotalWithoutTax(totalWithoutTax);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public InvoiceData build() {
        return invoiceData;
    }
}