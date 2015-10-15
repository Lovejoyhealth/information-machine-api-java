/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class UserLoyaltyPurchaseBuilder {
    //the instance to build
    private UserLoyaltyPurchase userLoyaltyPurchase;

    /**
     * Default constructor to initialize the instance
     */
    public UserLoyaltyPurchaseBuilder() {
        userLoyaltyPurchase = new UserLoyaltyPurchase();
    }

    public UserLoyaltyPurchaseBuilder purchaseItems(List<LoyaltyPurchaseItemData> purchaseItems) {
        userLoyaltyPurchase.setPurchaseItems(purchaseItems);
        return this;
    }

    public UserLoyaltyPurchaseBuilder userStore(UserStore userStore) {
        userLoyaltyPurchase.setUserStore(userStore);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserLoyaltyPurchase build() {
        return userLoyaltyPurchase;
    }
}