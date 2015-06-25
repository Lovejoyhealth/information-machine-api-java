/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class TagInfoBuilder {
    //the instance to build
    private TagInfo tagInfo;

	/**
     * Default constructor to initialize the instance
     */
    public TagInfoBuilder() {
        tagInfo = new TagInfo();
    }

    public TagInfoBuilder id(Integer id) {
        tagInfo.setId(id);
        return this;
    }

    public TagInfoBuilder name(String name) {
        tagInfo.setName(name);
        return this;
    }

    public TagInfoBuilder description(String description) {
        tagInfo.setDescription(description);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public TagInfo build() {
		return tagInfo;
	}
}