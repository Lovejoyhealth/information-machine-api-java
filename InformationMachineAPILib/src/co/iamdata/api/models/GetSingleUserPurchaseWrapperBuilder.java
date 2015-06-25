/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class GetSingleUserPurchaseWrapperBuilder {
    //the instance to build
    private GetSingleUserPurchaseWrapper getSingleUserPurchaseWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetSingleUserPurchaseWrapperBuilder() {
        getSingleUserPurchaseWrapper = new GetSingleUserPurchaseWrapper();
    }

    public GetSingleUserPurchaseWrapperBuilder result(UserPurchase result) {
        getSingleUserPurchaseWrapper.setResult(result);
        return this;
    }

    public GetSingleUserPurchaseWrapperBuilder meta(MetaBase meta) {
        getSingleUserPurchaseWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetSingleUserPurchaseWrapper build() {
		return getSingleUserPurchaseWrapper;
	}
}