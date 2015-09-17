/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class UploadBarcodeWrapperBuilder {
    //the instance to build
    private UploadBarcodeWrapper uploadBarcodeWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public UploadBarcodeWrapperBuilder() {
        uploadBarcodeWrapper = new UploadBarcodeWrapper();
    }

    public UploadBarcodeWrapperBuilder meta(MetaBase meta) {
        uploadBarcodeWrapper.setMeta(meta);
        return this;
    }

    public UploadBarcodeWrapperBuilder result(UploadBarcodeResponse result) {
        uploadBarcodeWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UploadBarcodeWrapper build() {
        return uploadBarcodeWrapper;
    }
}