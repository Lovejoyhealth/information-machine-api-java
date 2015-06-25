/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class ConnectStoreWrapperBuilder {
    //the instance to build
    private ConnectStoreWrapper connectStoreWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public ConnectStoreWrapperBuilder() {
        connectStoreWrapper = new ConnectStoreWrapper();
    }

    public ConnectStoreWrapperBuilder result(ConnectUserStoreResponse result) {
        connectStoreWrapper.setResult(result);
        return this;
    }

    public ConnectStoreWrapperBuilder meta(MetaBase meta) {
        connectStoreWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public ConnectStoreWrapper build() {
		return connectStoreWrapper;
	}
}