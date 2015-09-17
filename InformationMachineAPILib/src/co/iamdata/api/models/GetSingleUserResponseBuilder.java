/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetSingleUserResponseBuilder {
    //the instance to build
    private GetSingleUserResponse getSingleUserResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetSingleUserResponseBuilder() {
        getSingleUserResponse = new GetSingleUserResponse();
    }

    public GetSingleUserResponseBuilder createdAt(String createdAt) {
        getSingleUserResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetSingleUserResponseBuilder email(String email) {
        getSingleUserResponse.setEmail(email);
        return this;
    }

    public GetSingleUserResponseBuilder ownerAppId(String ownerAppId) {
        getSingleUserResponse.setOwnerAppId(ownerAppId);
        return this;
    }

    public GetSingleUserResponseBuilder userId(String userId) {
        getSingleUserResponse.setUserId(userId);
        return this;
    }

    public GetSingleUserResponseBuilder zip(String zip) {
        getSingleUserResponse.setZip(zip);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSingleUserResponse build() {
        return getSingleUserResponse;
    }
}