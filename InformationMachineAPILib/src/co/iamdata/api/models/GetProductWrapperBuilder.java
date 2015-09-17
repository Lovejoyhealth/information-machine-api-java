/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetProductWrapperBuilder {
    //the instance to build
    private GetProductWrapper getProductWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetProductWrapperBuilder() {
        getProductWrapper = new GetProductWrapper();
    }

    public GetProductWrapperBuilder meta(MetaBase meta) {
        getProductWrapper.setMeta(meta);
        return this;
    }

    public GetProductWrapperBuilder result(ProductData result) {
        getProductWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetProductWrapper build() {
        return getProductWrapper;
    }
}