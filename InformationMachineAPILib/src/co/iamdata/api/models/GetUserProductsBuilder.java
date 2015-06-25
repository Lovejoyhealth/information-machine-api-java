/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetUserProductsBuilder {
    //the instance to build
    private GetUserProducts getUserProducts;

	/**
     * Default constructor to initialize the instance
     */
    public GetUserProductsBuilder() {
        getUserProducts = new GetUserProducts();
    }

    public GetUserProductsBuilder result(List<ProductData> result) {
        getUserProducts.setResult(result);
        return this;
    }

    public GetUserProductsBuilder meta(MetaPaged meta) {
        getUserProducts.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetUserProducts build() {
		return getUserProducts;
	}
}