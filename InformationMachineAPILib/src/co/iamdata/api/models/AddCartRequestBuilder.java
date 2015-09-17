/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class AddCartRequestBuilder {
    //the instance to build
    private AddCartRequest addCartRequest;

    /**
     * Default constructor to initialize the instance
     */
    public AddCartRequestBuilder() {
        addCartRequest = new AddCartRequest();
    }

    public AddCartRequestBuilder cartName(String cartName) {
        addCartRequest.setCartName(cartName);
        return this;
    }

    public AddCartRequestBuilder description(String description) {
        addCartRequest.setDescription(description);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddCartRequest build() {
        return addCartRequest;
    }
}