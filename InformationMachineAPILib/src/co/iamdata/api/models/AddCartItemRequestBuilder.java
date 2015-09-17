/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class AddCartItemRequestBuilder {
    //the instance to build
    private AddCartItemRequest addCartItemRequest;

    /**
     * Default constructor to initialize the instance
     */
    public AddCartItemRequestBuilder() {
        addCartItemRequest = new AddCartItemRequest();
    }

    public AddCartItemRequestBuilder quantity(int quantity) {
        addCartItemRequest.setQuantity(quantity);
        return this;
    }

    public AddCartItemRequestBuilder upc(String upc) {
        addCartItemRequest.setUpc(upc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddCartItemRequest build() {
        return addCartItemRequest;
    }
}