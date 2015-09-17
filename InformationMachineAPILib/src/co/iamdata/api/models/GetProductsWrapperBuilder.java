/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetProductsWrapperBuilder {
    //the instance to build
    private GetProductsWrapper getProductsWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetProductsWrapperBuilder() {
        getProductsWrapper = new GetProductsWrapper();
    }

    public GetProductsWrapperBuilder meta(MetaPaged meta) {
        getProductsWrapper.setMeta(meta);
        return this;
    }

    public GetProductsWrapperBuilder result(List<ProductData> result) {
        getProductsWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetProductsWrapper build() {
        return getProductsWrapper;
    }
}