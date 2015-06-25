/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class DeleteSingleStoreWrapperBuilder {
    //the instance to build
    private DeleteSingleStoreWrapper deleteSingleStoreWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public DeleteSingleStoreWrapperBuilder() {
        deleteSingleStoreWrapper = new DeleteSingleStoreWrapper();
    }

    public DeleteSingleStoreWrapperBuilder result(String result) {
        deleteSingleStoreWrapper.setResult(result);
        return this;
    }

    public DeleteSingleStoreWrapperBuilder meta(MetaBase meta) {
        deleteSingleStoreWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public DeleteSingleStoreWrapper build() {
		return deleteSingleStoreWrapper;
	}
}