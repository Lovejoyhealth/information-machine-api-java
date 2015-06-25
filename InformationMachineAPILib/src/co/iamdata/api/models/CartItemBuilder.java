/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class CartItemBuilder {
    //the instance to build
    private CartItem cartItem;

	/**
     * Default constructor to initialize the instance
     */
    public CartItemBuilder() {
        cartItem = new CartItem();
    }

    public CartItemBuilder cartItemId(String cartItemId) {
        cartItem.setCartItemId(cartItemId);
        return this;
    }

    public CartItemBuilder upc(String upc) {
        cartItem.setUpc(upc);
        return this;
    }

    public CartItemBuilder quantity(Integer quantity) {
        cartItem.setQuantity(quantity);
        return this;
    }

    public CartItemBuilder createdAt(String createdAt) {
        cartItem.setCreatedAt(createdAt);
        return this;
    }

    public CartItemBuilder updatedAt(String updatedAt) {
        cartItem.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public CartItem build() {
		return cartItem;
	}
}