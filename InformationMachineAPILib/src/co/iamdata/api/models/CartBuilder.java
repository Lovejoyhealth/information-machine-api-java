/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class CartBuilder {
    //the instance to build
    private Cart cart;

    /**
     * Default constructor to initialize the instance
     */
    public CartBuilder() {
        cart = new Cart();
    }

    public CartBuilder cartId(String cartId) {
        cart.setCartId(cartId);
        return this;
    }

    public CartBuilder cartItems(List<CartItem> cartItems) {
        cart.setCartItems(cartItems);
        return this;
    }

    public CartBuilder cartName(String cartName) {
        cart.setCartName(cartName);
        return this;
    }

    public CartBuilder createdAt(String createdAt) {
        cart.setCreatedAt(createdAt);
        return this;
    }

    public CartBuilder updatedAt(String updatedAt) {
        cart.setUpdatedAt(updatedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Cart build() {
        return cart;
    }
}