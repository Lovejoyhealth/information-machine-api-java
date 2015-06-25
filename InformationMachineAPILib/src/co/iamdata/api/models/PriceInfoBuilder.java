/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class PriceInfoBuilder {
    //the instance to build
    private PriceInfo priceInfo;

	/**
     * Default constructor to initialize the instance
     */
    public PriceInfoBuilder() {
        priceInfo = new PriceInfo();
    }

    public PriceInfoBuilder storeIdentifier(String storeIdentifier) {
        priceInfo.setStoreIdentifier(storeIdentifier);
        return this;
    }

    public PriceInfoBuilder price(Double price) {
        priceInfo.setPrice(price);
        return this;
    }

    public PriceInfoBuilder storeId(Integer storeId) {
        priceInfo.setStoreId(storeId);
        return this;
    }

    public PriceInfoBuilder productId(Integer productId) {
        priceInfo.setProductId(productId);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public PriceInfo build() {
		return priceInfo;
	}
}