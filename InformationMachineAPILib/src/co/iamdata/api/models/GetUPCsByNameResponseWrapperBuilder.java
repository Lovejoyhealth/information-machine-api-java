/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetUPCsByNameResponseWrapperBuilder {
    //the instance to build
    private GetUPCsByNameResponseWrapper getUPCsByNameResponseWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetUPCsByNameResponseWrapperBuilder() {
        getUPCsByNameResponseWrapper = new GetUPCsByNameResponseWrapper();
    }

    public GetUPCsByNameResponseWrapperBuilder meta(MetaBase meta) {
        getUPCsByNameResponseWrapper.setMeta(meta);
        return this;
    }

    public GetUPCsByNameResponseWrapperBuilder result(List<NameUpcRecord> result) {
        getUPCsByNameResponseWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetUPCsByNameResponseWrapper build() {
        return getUPCsByNameResponseWrapper;
    }
}