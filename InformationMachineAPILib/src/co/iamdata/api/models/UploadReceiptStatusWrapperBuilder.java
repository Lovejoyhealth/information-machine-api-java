/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class UploadReceiptStatusWrapperBuilder {
    //the instance to build
    private UploadReceiptStatusWrapper uploadReceiptStatusWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public UploadReceiptStatusWrapperBuilder() {
        uploadReceiptStatusWrapper = new UploadReceiptStatusWrapper();
    }

    public UploadReceiptStatusWrapperBuilder meta(MetaBase meta) {
        uploadReceiptStatusWrapper.setMeta(meta);
        return this;
    }

    public UploadReceiptStatusWrapperBuilder result(String result) {
        uploadReceiptStatusWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UploadReceiptStatusWrapper build() {
        return uploadReceiptStatusWrapper;
    }
}