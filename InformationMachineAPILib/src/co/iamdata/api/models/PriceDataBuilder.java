/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class PriceDataBuilder {
    //the instance to build
    private PriceData priceData;

    /**
     * Default constructor to initialize the instance
     */
    public PriceDataBuilder() {
        priceData = new PriceData();
    }

    public PriceDataBuilder prices(List<PriceInfo> prices) {
        priceData.setPrices(prices);
        return this;
    }

    public PriceDataBuilder productId(Integer productId) {
        priceData.setProductId(productId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PriceData build() {
        return priceData;
    }
}