/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class UpdateStoreConnectionWrapperBuilder {
    //the instance to build
    private UpdateStoreConnectionWrapper updateStoreConnectionWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateStoreConnectionWrapperBuilder() {
        updateStoreConnectionWrapper = new UpdateStoreConnectionWrapper();
    }

    public UpdateStoreConnectionWrapperBuilder meta(MetaBase meta) {
        updateStoreConnectionWrapper.setMeta(meta);
        return this;
    }

    public UpdateStoreConnectionWrapperBuilder result(String result) {
        updateStoreConnectionWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateStoreConnectionWrapper build() {
        return updateStoreConnectionWrapper;
    }
}