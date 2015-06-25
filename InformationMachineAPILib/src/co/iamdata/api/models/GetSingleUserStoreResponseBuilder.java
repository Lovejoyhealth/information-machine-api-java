/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class GetSingleUserStoreResponseBuilder {
    //the instance to build
    private GetSingleUserStoreResponse getSingleUserStoreResponse;

	/**
     * Default constructor to initialize the instance
     */
    public GetSingleUserStoreResponseBuilder() {
        getSingleUserStoreResponse = new GetSingleUserStoreResponse();
    }

    public GetSingleUserStoreResponseBuilder user(UserData user) {
        getSingleUserStoreResponse.setUser(user);
        return this;
    }

    public GetSingleUserStoreResponseBuilder id(Integer id) {
        getSingleUserStoreResponse.setId(id);
        return this;
    }

    public GetSingleUserStoreResponseBuilder storeName(String storeName) {
        getSingleUserStoreResponse.setStoreName(storeName);
        return this;
    }

    public GetSingleUserStoreResponseBuilder username(String username) {
        getSingleUserStoreResponse.setUsername(username);
        return this;
    }

    public GetSingleUserStoreResponseBuilder credentialsStatus(String credentialsStatus) {
        getSingleUserStoreResponse.setCredentialsStatus(credentialsStatus);
        return this;
    }

    public GetSingleUserStoreResponseBuilder scrapeStatus(String scrapeStatus) {
        getSingleUserStoreResponse.setScrapeStatus(scrapeStatus);
        return this;
    }

    public GetSingleUserStoreResponseBuilder createdAt(String createdAt) {
        getSingleUserStoreResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetSingleUserStoreResponseBuilder updatedAt(String updatedAt) {
        getSingleUserStoreResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetSingleUserStoreResponse build() {
		return getSingleUserStoreResponse;
	}
}