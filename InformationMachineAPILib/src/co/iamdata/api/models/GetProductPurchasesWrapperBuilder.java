/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetProductPurchasesWrapperBuilder {
    //the instance to build
    private GetProductPurchasesWrapper getProductPurchasesWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetProductPurchasesWrapperBuilder() {
        getProductPurchasesWrapper = new GetProductPurchasesWrapper();
    }

    public GetProductPurchasesWrapperBuilder result(List<PurchasedProduct> result) {
        getProductPurchasesWrapper.setResult(result);
        return this;
    }

    public GetProductPurchasesWrapperBuilder meta(MetaPaged meta) {
        getProductPurchasesWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetProductPurchasesWrapper build() {
		return getProductPurchasesWrapper;
	}
}