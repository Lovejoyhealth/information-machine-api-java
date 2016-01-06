/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetUPCsByNameRequestWrapperBuilder {
    //the instance to build
    private GetUPCsByNameRequestWrapper getUPCsByNameRequestWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetUPCsByNameRequestWrapperBuilder() {
        getUPCsByNameRequestWrapper = new GetUPCsByNameRequestWrapper();
    }

    public GetUPCsByNameRequestWrapperBuilder meta(MetaBase meta) {
        getUPCsByNameRequestWrapper.setMeta(meta);
        return this;
    }

    public GetUPCsByNameRequestWrapperBuilder result(String result) {
        getUPCsByNameRequestWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetUPCsByNameRequestWrapper build() {
        return getUPCsByNameRequestWrapper;
    }
}