/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class DeleteCartWrapperBuilder {
    //the instance to build
    private DeleteCartWrapper deleteCartWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public DeleteCartWrapperBuilder() {
        deleteCartWrapper = new DeleteCartWrapper();
    }

    public DeleteCartWrapperBuilder result(String result) {
        deleteCartWrapper.setResult(result);
        return this;
    }

    public DeleteCartWrapperBuilder meta(MetaBase meta) {
        deleteCartWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public DeleteCartWrapper build() {
		return deleteCartWrapper;
	}
}