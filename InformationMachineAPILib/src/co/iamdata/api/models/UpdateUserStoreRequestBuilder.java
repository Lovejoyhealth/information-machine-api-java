/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class UpdateUserStoreRequestBuilder {
    //the instance to build
    private UpdateUserStoreRequest updateUserStoreRequest;

	/**
     * Default constructor to initialize the instance
     */
    public UpdateUserStoreRequestBuilder() {
        updateUserStoreRequest = new UpdateUserStoreRequest();
    }

    public UpdateUserStoreRequestBuilder username(String username) {
        updateUserStoreRequest.setUsername(username);
        return this;
    }

    public UpdateUserStoreRequestBuilder password(String password) {
        updateUserStoreRequest.setPassword(password);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public UpdateUserStoreRequest build() {
		return updateUserStoreRequest;
	}
}