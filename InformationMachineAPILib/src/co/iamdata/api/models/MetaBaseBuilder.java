/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class MetaBaseBuilder {
    //the instance to build
    private MetaBase metaBase;

    /**
     * Default constructor to initialize the instance
     */
    public MetaBaseBuilder() {
        metaBase = new MetaBase();
    }

    public MetaBaseBuilder maxNumberOfRequestsPerDay(Integer maxNumberOfRequestsPerDay) {
        metaBase.setMaxNumberOfRequestsPerDay(maxNumberOfRequestsPerDay);
        return this;
    }

    public MetaBaseBuilder remainingNumberOfRequest(Integer remainingNumberOfRequest) {
        metaBase.setRemainingNumberOfRequest(remainingNumberOfRequest);
        return this;
    }

    public MetaBaseBuilder timeInEpochSecondTillReset(Double timeInEpochSecondTillReset) {
        metaBase.setTimeInEpochSecondTillReset(timeInEpochSecondTillReset);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MetaBase build() {
        return metaBase;
    }
}