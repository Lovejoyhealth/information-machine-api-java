/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class NutrientDataBuilder {
    //the instance to build
    private NutrientData nutrientData;

	/**
     * Default constructor to initialize the instance
     */
    public NutrientDataBuilder() {
        nutrientData = new NutrientData();
    }

    public NutrientDataBuilder dvp(Double dvp) {
        nutrientData.setDvp(dvp);
        return this;
    }

    public NutrientDataBuilder value(Double value) {
        nutrientData.setValue(value);
        return this;
    }

    public NutrientDataBuilder name(String name) {
        nutrientData.setName(name);
        return this;
    }

    public NutrientDataBuilder id(Integer id) {
        nutrientData.setId(id);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public NutrientData build() {
		return nutrientData;
	}
}