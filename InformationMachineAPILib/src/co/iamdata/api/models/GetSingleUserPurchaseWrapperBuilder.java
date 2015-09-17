/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetSingleUserPurchaseWrapperBuilder {
    //the instance to build
    private GetSingleUserPurchaseWrapper getSingleUserPurchaseWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetSingleUserPurchaseWrapperBuilder() {
        getSingleUserPurchaseWrapper = new GetSingleUserPurchaseWrapper();
    }

    public GetSingleUserPurchaseWrapperBuilder meta(MetaBase meta) {
        getSingleUserPurchaseWrapper.setMeta(meta);
        return this;
    }

    public GetSingleUserPurchaseWrapperBuilder result(UserPurchase result) {
        getSingleUserPurchaseWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSingleUserPurchaseWrapper build() {
        return getSingleUserPurchaseWrapper;
    }
}