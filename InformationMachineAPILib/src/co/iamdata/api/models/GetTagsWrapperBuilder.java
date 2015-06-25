/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetTagsWrapperBuilder {
    //the instance to build
    private GetTagsWrapper getTagsWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetTagsWrapperBuilder() {
        getTagsWrapper = new GetTagsWrapper();
    }

    public GetTagsWrapperBuilder result(List<TagInfo> result) {
        getTagsWrapper.setResult(result);
        return this;
    }

    public GetTagsWrapperBuilder meta(MetaBase meta) {
        getTagsWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetTagsWrapper build() {
		return getTagsWrapper;
	}
}