/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class AddCartItemWrapperBuilder {
    //the instance to build
    private AddCartItemWrapper addCartItemWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public AddCartItemWrapperBuilder() {
        addCartItemWrapper = new AddCartItemWrapper();
    }

    public AddCartItemWrapperBuilder meta(MetaBase meta) {
        addCartItemWrapper.setMeta(meta);
        return this;
    }

    public AddCartItemWrapperBuilder result(CartItem result) {
        addCartItemWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddCartItemWrapper build() {
        return addCartItemWrapper;
    }
}