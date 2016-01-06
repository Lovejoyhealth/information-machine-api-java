/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class NameResolveRequestBuilder {
    //the instance to build
    private NameResolveRequest nameResolveRequest;

    /**
     * Default constructor to initialize the instance
     */
    public NameResolveRequestBuilder() {
        nameResolveRequest = new NameResolveRequest();
    }

    public NameResolveRequestBuilder nameStoreList(List<String> nameStoreList) {
        nameResolveRequest.setNameStoreList(nameStoreList);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public NameResolveRequest build() {
        return nameResolveRequest;
    }
}