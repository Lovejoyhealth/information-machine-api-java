/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class CreateUserWrapperBuilder {
    //the instance to build
    private CreateUserWrapper createUserWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public CreateUserWrapperBuilder() {
        createUserWrapper = new CreateUserWrapper();
    }

    public CreateUserWrapperBuilder meta(MetaBase meta) {
        createUserWrapper.setMeta(meta);
        return this;
    }

    public CreateUserWrapperBuilder result(UserData result) {
        createUserWrapper.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateUserWrapper build() {
        return createUserWrapper;
    }
}