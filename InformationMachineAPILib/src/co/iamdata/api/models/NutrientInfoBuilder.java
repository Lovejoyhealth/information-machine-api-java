/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class NutrientInfoBuilder {
    //the instance to build
    private NutrientInfo nutrientInfo;

    /**
     * Default constructor to initialize the instance
     */
    public NutrientInfoBuilder() {
        nutrientInfo = new NutrientInfo();
    }

    public NutrientInfoBuilder description(String description) {
        nutrientInfo.setDescription(description);
        return this;
    }

    public NutrientInfoBuilder id(Integer id) {
        nutrientInfo.setId(id);
        return this;
    }

    public NutrientInfoBuilder name(String name) {
        nutrientInfo.setName(name);
        return this;
    }

    public NutrientInfoBuilder preferredUnitOfMeasurement(String preferredUnitOfMeasurement) {
        nutrientInfo.setPreferredUnitOfMeasurement(preferredUnitOfMeasurement);
        return this;
    }

    public NutrientInfoBuilder recommendedDailyValue(Double recommendedDailyValue) {
        nutrientInfo.setRecommendedDailyValue(recommendedDailyValue);
        return this;
    }

    public NutrientInfoBuilder unitOfMeasurement(String unitOfMeasurement) {
        nutrientInfo.setUnitOfMeasurement(unitOfMeasurement);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public NutrientInfo build() {
        return nutrientInfo;
    }
}