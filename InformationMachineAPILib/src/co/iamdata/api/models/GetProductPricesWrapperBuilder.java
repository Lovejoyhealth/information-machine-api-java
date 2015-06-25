/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetProductPricesWrapperBuilder {
    //the instance to build
    private GetProductPricesWrapper getProductPricesWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetProductPricesWrapperBuilder() {
        getProductPricesWrapper = new GetProductPricesWrapper();
    }

    public GetProductPricesWrapperBuilder result(List<PriceData> result) {
        getProductPricesWrapper.setResult(result);
        return this;
    }

    public GetProductPricesWrapperBuilder meta(MetaBase meta) {
        getProductPricesWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetProductPricesWrapper build() {
		return getProductPricesWrapper;
	}
}