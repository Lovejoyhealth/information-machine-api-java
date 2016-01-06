/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class ProductTimestampsBuilder {
    //the instance to build
    private ProductTimestamps productTimestamps;

    /**
     * Default constructor to initialize the instance
     */
    public ProductTimestampsBuilder() {
        productTimestamps = new ProductTimestamps();
    }

    public ProductTimestampsBuilder recordedAt(String recordedAt) {
        productTimestamps.setRecordedAt(recordedAt);
        return this;
    }

    public ProductTimestampsBuilder upcResolvedAt(String upcResolvedAt) {
        productTimestamps.setUpcResolvedAt(upcResolvedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ProductTimestamps build() {
        return productTimestamps;
    }
}