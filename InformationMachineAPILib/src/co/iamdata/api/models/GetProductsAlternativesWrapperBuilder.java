/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetProductsAlternativesWrapperBuilder {
    //the instance to build
    private GetProductsAlternativesWrapper getProductsAlternativesWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetProductsAlternativesWrapperBuilder() {
        getProductsAlternativesWrapper = new GetProductsAlternativesWrapper();
    }

    public GetProductsAlternativesWrapperBuilder meta(MetaBase meta) {
        getProductsAlternativesWrapper.setMeta(meta);
        return this;
    }

    public GetProductsAlternativesWrapperBuilder result(List<ProductAlternativesRecord> result) {
        getProductsAlternativesWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetProductsAlternativesWrapper build() {
        return getProductsAlternativesWrapper;
    }
}