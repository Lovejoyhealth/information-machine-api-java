/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class ConnectUserStoreResponseBuilder {
    //the instance to build
    private ConnectUserStoreResponse connectUserStoreResponse;

	/**
     * Default constructor to initialize the instance
     */
    public ConnectUserStoreResponseBuilder() {
        connectUserStoreResponse = new ConnectUserStoreResponse();
    }

    public ConnectUserStoreResponseBuilder user(UserData user) {
        connectUserStoreResponse.setUser(user);
        return this;
    }

    public ConnectUserStoreResponseBuilder id(Integer id) {
        connectUserStoreResponse.setId(id);
        return this;
    }

    public ConnectUserStoreResponseBuilder storeName(String storeName) {
        connectUserStoreResponse.setStoreName(storeName);
        return this;
    }

    public ConnectUserStoreResponseBuilder username(String username) {
        connectUserStoreResponse.setUsername(username);
        return this;
    }

    public ConnectUserStoreResponseBuilder credentialsStatus(String credentialsStatus) {
        connectUserStoreResponse.setCredentialsStatus(credentialsStatus);
        return this;
    }

    public ConnectUserStoreResponseBuilder scrapeStatus(String scrapeStatus) {
        connectUserStoreResponse.setScrapeStatus(scrapeStatus);
        return this;
    }

    public ConnectUserStoreResponseBuilder createdAt(String createdAt) {
        connectUserStoreResponse.setCreatedAt(createdAt);
        return this;
    }

    public ConnectUserStoreResponseBuilder updatedAt(String updatedAt) {
        connectUserStoreResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public ConnectUserStoreResponse build() {
		return connectUserStoreResponse;
	}
}