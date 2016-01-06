/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetUserPurchaseHistoryWrapperBuilder {
    //the instance to build
    private GetUserPurchaseHistoryWrapper getUserPurchaseHistoryWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetUserPurchaseHistoryWrapperBuilder() {
        getUserPurchaseHistoryWrapper = new GetUserPurchaseHistoryWrapper();
    }

    public GetUserPurchaseHistoryWrapperBuilder meta(MetaBase meta) {
        getUserPurchaseHistoryWrapper.setMeta(meta);
        return this;
    }

    public GetUserPurchaseHistoryWrapperBuilder result(PurchaseData result) {
        getUserPurchaseHistoryWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetUserPurchaseHistoryWrapper build() {
        return getUserPurchaseHistoryWrapper;
    }
}