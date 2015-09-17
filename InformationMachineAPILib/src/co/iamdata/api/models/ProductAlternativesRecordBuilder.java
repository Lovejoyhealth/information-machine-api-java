/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class ProductAlternativesRecordBuilder {
    //the instance to build
    private ProductAlternativesRecord productAlternativesRecord;

    /**
     * Default constructor to initialize the instance
     */
    public ProductAlternativesRecordBuilder() {
        productAlternativesRecord = new ProductAlternativesRecord();
    }

    public ProductAlternativesRecordBuilder productAlternatives(List<ProductData> productAlternatives) {
        productAlternativesRecord.setProductAlternatives(productAlternatives);
        return this;
    }

    public ProductAlternativesRecordBuilder productId(Integer productId) {
        productAlternativesRecord.setProductId(productId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ProductAlternativesRecord build() {
        return productAlternativesRecord;
    }
}