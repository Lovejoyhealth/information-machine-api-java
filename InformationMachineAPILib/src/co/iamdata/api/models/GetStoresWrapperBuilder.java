/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetStoresWrapperBuilder {
    //the instance to build
    private GetStoresWrapper getStoresWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetStoresWrapperBuilder() {
        getStoresWrapper = new GetStoresWrapper();
    }

    public GetStoresWrapperBuilder meta(MetaBase meta) {
        getStoresWrapper.setMeta(meta);
        return this;
    }

    public GetStoresWrapperBuilder result(List<StoreInfo> result) {
        getStoresWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetStoresWrapper build() {
        return getStoresWrapper;
    }
}