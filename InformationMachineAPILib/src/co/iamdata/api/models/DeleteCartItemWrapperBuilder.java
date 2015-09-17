/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class DeleteCartItemWrapperBuilder {
    //the instance to build
    private DeleteCartItemWrapper deleteCartItemWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteCartItemWrapperBuilder() {
        deleteCartItemWrapper = new DeleteCartItemWrapper();
    }

    public DeleteCartItemWrapperBuilder meta(MetaBase meta) {
        deleteCartItemWrapper.setMeta(meta);
        return this;
    }

    public DeleteCartItemWrapperBuilder result(String result) {
        deleteCartItemWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteCartItemWrapper build() {
        return deleteCartItemWrapper;
    }
}