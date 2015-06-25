/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class StoreInfoBuilder {
    //the instance to build
    private StoreInfo storeInfo;

	/**
     * Default constructor to initialize the instance
     */
    public StoreInfoBuilder() {
        storeInfo = new StoreInfo();
    }

    public StoreInfoBuilder id(Integer id) {
        storeInfo.setId(id);
        return this;
    }

    public StoreInfoBuilder name(String name) {
        storeInfo.setName(name);
        return this;
    }

    public StoreInfoBuilder restaurant(Boolean restaurant) {
        storeInfo.setRestaurant(restaurant);
        return this;
    }

    public StoreInfoBuilder canScrape(Boolean canScrape) {
        storeInfo.setCanScrape(canScrape);
        return this;
    }

    public StoreInfoBuilder imageLink(String imageLink) {
        storeInfo.setImageLink(imageLink);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public StoreInfo build() {
		return storeInfo;
	}
}