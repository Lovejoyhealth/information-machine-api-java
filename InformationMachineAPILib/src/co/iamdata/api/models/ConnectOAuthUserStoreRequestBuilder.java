/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class ConnectOAuthUserStoreRequestBuilder {
    //the instance to build
    private ConnectOAuthUserStoreRequest connectOAuthUserStoreRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ConnectOAuthUserStoreRequestBuilder() {
        connectOAuthUserStoreRequest = new ConnectOAuthUserStoreRequest();
    }

    public ConnectOAuthUserStoreRequestBuilder oauthProvider(String oauthProvider) {
        connectOAuthUserStoreRequest.setOauthProvider(oauthProvider);
        return this;
    }

    public ConnectOAuthUserStoreRequestBuilder storeId(int storeId) {
        connectOAuthUserStoreRequest.setStoreId(storeId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ConnectOAuthUserStoreRequest build() {
        return connectOAuthUserStoreRequest;
    }
}