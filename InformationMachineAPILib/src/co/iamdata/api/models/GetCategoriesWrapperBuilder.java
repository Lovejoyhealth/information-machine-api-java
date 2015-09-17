/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class GetCategoriesWrapperBuilder {
    //the instance to build
    private GetCategoriesWrapper getCategoriesWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public GetCategoriesWrapperBuilder() {
        getCategoriesWrapper = new GetCategoriesWrapper();
    }

    public GetCategoriesWrapperBuilder meta(MetaBase meta) {
        getCategoriesWrapper.setMeta(meta);
        return this;
    }

    public GetCategoriesWrapperBuilder result(List<CategoryInfo> result) {
        getCategoriesWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCategoriesWrapper build() {
        return getCategoriesWrapper;
    }
}