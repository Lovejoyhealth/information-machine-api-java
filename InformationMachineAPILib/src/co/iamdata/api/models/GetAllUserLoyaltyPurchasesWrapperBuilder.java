/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetAllUserLoyaltyPurchasesWrapperBuilder {
    //the instance to build
    private GetAllUserLoyaltyPurchasesWrapper getAllUserLoyaltyPurchasesWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetAllUserLoyaltyPurchasesWrapperBuilder() {
        getAllUserLoyaltyPurchasesWrapper = new GetAllUserLoyaltyPurchasesWrapper();
    }

    public GetAllUserLoyaltyPurchasesWrapperBuilder meta(MetaPaged meta) {
        getAllUserLoyaltyPurchasesWrapper.setMeta(meta);
        return this;
    }

    public GetAllUserLoyaltyPurchasesWrapperBuilder result(List<UserLoyaltyPurchase> result) {
        getAllUserLoyaltyPurchasesWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAllUserLoyaltyPurchasesWrapper build() {
        return getAllUserLoyaltyPurchasesWrapper;
    }
}