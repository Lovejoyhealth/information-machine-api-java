/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class ConnectUserStoreRequestBuilder {
    //the instance to build
    private ConnectUserStoreRequest connectUserStoreRequest;

	/**
     * Default constructor to initialize the instance
     */
    public ConnectUserStoreRequestBuilder() {
        connectUserStoreRequest = new ConnectUserStoreRequest();
    }

    public ConnectUserStoreRequestBuilder storeId(int storeId) {
        connectUserStoreRequest.setStoreId(storeId);
        return this;
    }

    public ConnectUserStoreRequestBuilder username(String username) {
        connectUserStoreRequest.setUsername(username);
        return this;
    }

    public ConnectUserStoreRequestBuilder password(String password) {
        connectUserStoreRequest.setPassword(password);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public ConnectUserStoreRequest build() {
		return connectUserStoreRequest;
	}
}