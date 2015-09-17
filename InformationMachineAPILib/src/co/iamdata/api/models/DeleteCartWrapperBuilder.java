/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class DeleteCartWrapperBuilder {
    //the instance to build
    private DeleteCartWrapper deleteCartWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteCartWrapperBuilder() {
        deleteCartWrapper = new DeleteCartWrapper();
    }

    public DeleteCartWrapperBuilder meta(MetaBase meta) {
        deleteCartWrapper.setMeta(meta);
        return this;
    }

    public DeleteCartWrapperBuilder result(String result) {
        deleteCartWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteCartWrapper build() {
        return deleteCartWrapper;
    }
}