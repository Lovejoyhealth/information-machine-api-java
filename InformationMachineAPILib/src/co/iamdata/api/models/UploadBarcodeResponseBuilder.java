/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class UploadBarcodeResponseBuilder {
    //the instance to build
    private UploadBarcodeResponse uploadBarcodeResponse;

    /**
     * Default constructor to initialize the instance
     */
    public UploadBarcodeResponseBuilder() {
        uploadBarcodeResponse = new UploadBarcodeResponse();
    }

    public UploadBarcodeResponseBuilder apiProduct(ProductData apiProduct) {
        uploadBarcodeResponse.setApiProduct(apiProduct);
        return this;
    }

    public UploadBarcodeResponseBuilder barCode(String barCode) {
        uploadBarcodeResponse.setBarCode(barCode);
        return this;
    }

    public UploadBarcodeResponseBuilder barCodeType(String barCodeType) {
        uploadBarcodeResponse.setBarCodeType(barCodeType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UploadBarcodeResponse build() {
        return uploadBarcodeResponse;
    }
}