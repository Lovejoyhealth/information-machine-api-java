/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class UserStoreBuilder {
    //the instance to build
    private UserStore userStore;

	/**
     * Default constructor to initialize the instance
     */
    public UserStoreBuilder() {
        userStore = new UserStore();
    }

    public UserStoreBuilder user(UserData user) {
        userStore.setUser(user);
        return this;
    }

    public UserStoreBuilder id(Integer id) {
        userStore.setId(id);
        return this;
    }

    public UserStoreBuilder supermarketId(Integer supermarketId) {
        userStore.setSupermarketId(supermarketId);
        return this;
    }

    public UserStoreBuilder storeName(String storeName) {
        userStore.setStoreName(storeName);
        return this;
    }

    public UserStoreBuilder username(String username) {
        userStore.setUsername(username);
        return this;
    }

    public UserStoreBuilder credentialsStatus(String credentialsStatus) {
        userStore.setCredentialsStatus(credentialsStatus);
        return this;
    }

    public UserStoreBuilder scrapeStatus(String scrapeStatus) {
        userStore.setScrapeStatus(scrapeStatus);
        return this;
    }

    public UserStoreBuilder createdAt(String createdAt) {
        userStore.setCreatedAt(createdAt);
        return this;
    }

    public UserStoreBuilder updatedAt(String updatedAt) {
        userStore.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public UserStore build() {
		return userStore;
	}
}