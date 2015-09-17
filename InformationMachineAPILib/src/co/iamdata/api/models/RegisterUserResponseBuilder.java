/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class RegisterUserResponseBuilder {
    //the instance to build
    private RegisterUserResponse registerUserResponse;

    /**
     * Default constructor to initialize the instance
     */
    public RegisterUserResponseBuilder() {
        registerUserResponse = new RegisterUserResponse();
    }

    public RegisterUserResponseBuilder createdAt(String createdAt) {
        registerUserResponse.setCreatedAt(createdAt);
        return this;
    }

    public RegisterUserResponseBuilder email(String email) {
        registerUserResponse.setEmail(email);
        return this;
    }

    public RegisterUserResponseBuilder ownerAppId(String ownerAppId) {
        registerUserResponse.setOwnerAppId(ownerAppId);
        return this;
    }

    public RegisterUserResponseBuilder userId(String userId) {
        registerUserResponse.setUserId(userId);
        return this;
    }

    public RegisterUserResponseBuilder zip(String zip) {
        registerUserResponse.setZip(zip);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RegisterUserResponse build() {
        return registerUserResponse;
    }
}