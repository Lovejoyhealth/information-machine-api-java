/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetNutrientsWrapperBuilder {
    //the instance to build
    private GetNutrientsWrapper getNutrientsWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetNutrientsWrapperBuilder() {
        getNutrientsWrapper = new GetNutrientsWrapper();
    }

    public GetNutrientsWrapperBuilder result(List<NutrientInfo> result) {
        getNutrientsWrapper.setResult(result);
        return this;
    }

    public GetNutrientsWrapperBuilder meta(MetaBase meta) {
        getNutrientsWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetNutrientsWrapper build() {
		return getNutrientsWrapper;
	}
}