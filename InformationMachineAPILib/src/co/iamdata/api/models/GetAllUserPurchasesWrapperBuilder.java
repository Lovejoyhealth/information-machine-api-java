/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetAllUserPurchasesWrapperBuilder {
    //the instance to build
    private GetAllUserPurchasesWrapper getAllUserPurchasesWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetAllUserPurchasesWrapperBuilder() {
        getAllUserPurchasesWrapper = new GetAllUserPurchasesWrapper();
    }

    public GetAllUserPurchasesWrapperBuilder result(List<UserPurchase> result) {
        getAllUserPurchasesWrapper.setResult(result);
        return this;
    }

    public GetAllUserPurchasesWrapperBuilder meta(MetaPaged meta) {
        getAllUserPurchasesWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetAllUserPurchasesWrapper build() {
		return getAllUserPurchasesWrapper;
	}
}