/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class RegisterUserRequestBuilder {
    //the instance to build
    private RegisterUserRequest registerUserRequest;

	/**
     * Default constructor to initialize the instance
     */
    public RegisterUserRequestBuilder() {
        registerUserRequest = new RegisterUserRequest();
    }

    public RegisterUserRequestBuilder email(String email) {
        registerUserRequest.setEmail(email);
        return this;
    }

    public RegisterUserRequestBuilder zip(String zip) {
        registerUserRequest.setZip(zip);
        return this;
    }

    public RegisterUserRequestBuilder userId(String userId) {
        registerUserRequest.setUserId(userId);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public RegisterUserRequest build() {
		return registerUserRequest;
	}
}