/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class AddCartWrapperBuilder {
    //the instance to build
    private AddCartWrapper addCartWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public AddCartWrapperBuilder() {
        addCartWrapper = new AddCartWrapper();
    }

    public AddCartWrapperBuilder meta(MetaBase meta) {
        addCartWrapper.setMeta(meta);
        return this;
    }

    public AddCartWrapperBuilder result(Cart result) {
        addCartWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddCartWrapper build() {
        return addCartWrapper;
    }
}