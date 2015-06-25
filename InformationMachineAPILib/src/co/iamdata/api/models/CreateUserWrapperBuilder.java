/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class CreateUserWrapperBuilder {
    //the instance to build
    private CreateUserWrapper createUserWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public CreateUserWrapperBuilder() {
        createUserWrapper = new CreateUserWrapper();
    }

    public CreateUserWrapperBuilder result(RegisterUserResponse result) {
        createUserWrapper.setResult(result);
        return this;
    }

    public CreateUserWrapperBuilder meta(MetaBase meta) {
        createUserWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public CreateUserWrapper build() {
		return createUserWrapper;
	}
}