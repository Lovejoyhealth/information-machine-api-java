/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetSingleUserWrapperBuilder {
    //the instance to build
    private GetSingleUserWrapper getSingleUserWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetSingleUserWrapperBuilder() {
        getSingleUserWrapper = new GetSingleUserWrapper();
    }

    public GetSingleUserWrapperBuilder meta(MetaBase meta) {
        getSingleUserWrapper.setMeta(meta);
        return this;
    }

    public GetSingleUserWrapperBuilder result(UserData result) {
        getSingleUserWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSingleUserWrapper build() {
        return getSingleUserWrapper;
    }
}