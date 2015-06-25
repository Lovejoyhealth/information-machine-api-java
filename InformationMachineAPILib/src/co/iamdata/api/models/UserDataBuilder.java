/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class UserDataBuilder {
    //the instance to build
    private UserData userData;

	/**
     * Default constructor to initialize the instance
     */
    public UserDataBuilder() {
        userData = new UserData();
    }

    public UserDataBuilder email(String email) {
        userData.setEmail(email);
        return this;
    }

    public UserDataBuilder zip(String zip) {
        userData.setZip(zip);
        return this;
    }

    public UserDataBuilder userId(String userId) {
        userData.setUserId(userId);
        return this;
    }

    public UserDataBuilder ownerAppId(String ownerAppId) {
        userData.setOwnerAppId(ownerAppId);
        return this;
    }

    public UserDataBuilder createdAt(String createdAt) {
        userData.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public UserData build() {
		return userData;
	}
}