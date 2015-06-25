/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class GetCartWrapperBuilder {
    //the instance to build
    private GetCartWrapper getCartWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetCartWrapperBuilder() {
        getCartWrapper = new GetCartWrapper();
    }

    public GetCartWrapperBuilder result(Cart result) {
        getCartWrapper.setResult(result);
        return this;
    }

    public GetCartWrapperBuilder meta(MetaBase meta) {
        getCartWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetCartWrapper build() {
		return getCartWrapper;
	}
}