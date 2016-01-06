/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class ConnectStoreWrapperBuilder {
    //the instance to build
    private ConnectStoreWrapper connectStoreWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public ConnectStoreWrapperBuilder() {
        connectStoreWrapper = new ConnectStoreWrapper();
    }

    public ConnectStoreWrapperBuilder meta(MetaBase meta) {
        connectStoreWrapper.setMeta(meta);
        return this;
    }

    public ConnectStoreWrapperBuilder result(UserStore result) {
        connectStoreWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ConnectStoreWrapper build() {
        return connectStoreWrapper;
    }
}