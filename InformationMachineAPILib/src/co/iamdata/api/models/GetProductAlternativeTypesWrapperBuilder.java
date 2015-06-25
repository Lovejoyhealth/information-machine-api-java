/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetProductAlternativeTypesWrapperBuilder {
    //the instance to build
    private GetProductAlternativeTypesWrapper getProductAlternativeTypesWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetProductAlternativeTypesWrapperBuilder() {
        getProductAlternativeTypesWrapper = new GetProductAlternativeTypesWrapper();
    }

    public GetProductAlternativeTypesWrapperBuilder result(List<ProductAlternativeTypeInfo> result) {
        getProductAlternativeTypesWrapper.setResult(result);
        return this;
    }

    public GetProductAlternativeTypesWrapperBuilder meta(MetaBase meta) {
        getProductAlternativeTypesWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetProductAlternativeTypesWrapper build() {
		return getProductAlternativeTypesWrapper;
	}
}