/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class GetSingleStoresWrapperBuilder {
    //the instance to build
    private GetSingleStoresWrapper getSingleStoresWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetSingleStoresWrapperBuilder() {
        getSingleStoresWrapper = new GetSingleStoresWrapper();
    }

    public GetSingleStoresWrapperBuilder result(GetSingleUserStoreResponse result) {
        getSingleStoresWrapper.setResult(result);
        return this;
    }

    public GetSingleStoresWrapperBuilder meta(MetaBase meta) {
        getSingleStoresWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetSingleStoresWrapper build() {
		return getSingleStoresWrapper;
	}
}