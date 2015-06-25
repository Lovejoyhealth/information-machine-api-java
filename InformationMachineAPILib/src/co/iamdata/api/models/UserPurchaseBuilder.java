/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class UserPurchaseBuilder {
    //the instance to build
    private UserPurchase userPurchase;

	/**
     * Default constructor to initialize the instance
     */
    public UserPurchaseBuilder() {
        userPurchase = new UserPurchase();
    }

    public UserPurchaseBuilder userStore(UserStore userStore) {
        userPurchase.setUserStore(userStore);
        return this;
    }

    public UserPurchaseBuilder purchaseItems(List<PurchaseItemData> purchaseItems) {
        userPurchase.setPurchaseItems(purchaseItems);
        return this;
    }

    public UserPurchaseBuilder id(Integer id) {
        userPurchase.setId(id);
        return this;
    }

    public UserPurchaseBuilder date(String date) {
        userPurchase.setDate(date);
        return this;
    }

    public UserPurchaseBuilder total(Double total) {
        userPurchase.setTotal(total);
        return this;
    }

    public UserPurchaseBuilder totalWithoutTax(Double totalWithoutTax) {
        userPurchase.setTotalWithoutTax(totalWithoutTax);
        return this;
    }

    public UserPurchaseBuilder tax(Double tax) {
        userPurchase.setTax(tax);
        return this;
    }

    public UserPurchaseBuilder orderNumber(String orderNumber) {
        userPurchase.setOrderNumber(orderNumber);
        return this;
    }

    public UserPurchaseBuilder receiptId(String receiptId) {
        userPurchase.setReceiptId(receiptId);
        return this;
    }

    public UserPurchaseBuilder receiptImageUrl(String receiptImageUrl) {
        userPurchase.setReceiptImageUrl(receiptImageUrl);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public UserPurchase build() {
		return userPurchase;
	}
}