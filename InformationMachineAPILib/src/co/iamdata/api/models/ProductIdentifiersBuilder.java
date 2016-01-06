/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class ProductIdentifiersBuilder {
    //the instance to build
    private ProductIdentifiers productIdentifiers;

    /**
     * Default constructor to initialize the instance
     */
    public ProductIdentifiersBuilder() {
        productIdentifiers = new ProductIdentifiers();
    }

    public ProductIdentifiersBuilder plus(List<String> plus) {
        productIdentifiers.setPlus(plus);
        return this;
    }

    public ProductIdentifiersBuilder upcs(List<String> upcs) {
        productIdentifiers.setUpcs(upcs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ProductIdentifiers build() {
        return productIdentifiers;
    }
}