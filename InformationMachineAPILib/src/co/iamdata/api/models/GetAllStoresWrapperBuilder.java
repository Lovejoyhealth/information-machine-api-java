/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetAllStoresWrapperBuilder {
    //the instance to build
    private GetAllStoresWrapper getAllStoresWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetAllStoresWrapperBuilder() {
        getAllStoresWrapper = new GetAllStoresWrapper();
    }

    public GetAllStoresWrapperBuilder meta(MetaPaged meta) {
        getAllStoresWrapper.setMeta(meta);
        return this;
    }

    public GetAllStoresWrapperBuilder result(List<UserStore> result) {
        getAllStoresWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAllStoresWrapper build() {
        return getAllStoresWrapper;
    }
}