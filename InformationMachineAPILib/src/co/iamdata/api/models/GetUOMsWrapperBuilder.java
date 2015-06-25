/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetUOMsWrapperBuilder {
    //the instance to build
    private GetUOMsWrapper getUOMsWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetUOMsWrapperBuilder() {
        getUOMsWrapper = new GetUOMsWrapper();
    }

    public GetUOMsWrapperBuilder result(List<UOMInfo> result) {
        getUOMsWrapper.setResult(result);
        return this;
    }

    public GetUOMsWrapperBuilder meta(MetaBase meta) {
        getUOMsWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetUOMsWrapper build() {
		return getUOMsWrapper;
	}
}