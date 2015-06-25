/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class DeleteUserWrapperBuilder {
    //the instance to build
    private DeleteUserWrapper deleteUserWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public DeleteUserWrapperBuilder() {
        deleteUserWrapper = new DeleteUserWrapper();
    }

    public DeleteUserWrapperBuilder result(String result) {
        deleteUserWrapper.setResult(result);
        return this;
    }

    public DeleteUserWrapperBuilder meta(MetaBase meta) {
        deleteUserWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public DeleteUserWrapper build() {
		return deleteUserWrapper;
	}
}