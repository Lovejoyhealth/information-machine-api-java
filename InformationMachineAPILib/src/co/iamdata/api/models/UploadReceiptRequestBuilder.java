/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class UploadReceiptRequestBuilder {
    //the instance to build
    private UploadReceiptRequest uploadReceiptRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UploadReceiptRequestBuilder() {
        uploadReceiptRequest = new UploadReceiptRequest();
    }

    public UploadReceiptRequestBuilder image(String image) {
        uploadReceiptRequest.setImage(image);
        return this;
    }

    public UploadReceiptRequestBuilder receiptId(String receiptId) {
        uploadReceiptRequest.setReceiptId(receiptId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UploadReceiptRequest build() {
        return uploadReceiptRequest;
    }
}