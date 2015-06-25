/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class ExecuteCartWrapperBuilder {
    //the instance to build
    private ExecuteCartWrapper executeCartWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public ExecuteCartWrapperBuilder() {
        executeCartWrapper = new ExecuteCartWrapper();
    }

    public ExecuteCartWrapperBuilder result(ExecuteCart result) {
        executeCartWrapper.setResult(result);
        return this;
    }

    public ExecuteCartWrapperBuilder meta(MetaBase meta) {
        executeCartWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public ExecuteCartWrapper build() {
		return executeCartWrapper;
	}
}