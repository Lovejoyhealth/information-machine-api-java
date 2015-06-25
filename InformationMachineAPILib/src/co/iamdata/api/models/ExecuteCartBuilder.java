/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class ExecuteCartBuilder {
    //the instance to build
    private ExecuteCart executeCart;

	/**
     * Default constructor to initialize the instance
     */
    public ExecuteCartBuilder() {
        executeCart = new ExecuteCart();
    }

    public ExecuteCartBuilder checkoutUrl(String checkoutUrl) {
        executeCart.setCheckoutUrl(checkoutUrl);
        return this;
    }

    public ExecuteCartBuilder message(String message) {
        executeCart.setMessage(message);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public ExecuteCart build() {
		return executeCart;
	}
}