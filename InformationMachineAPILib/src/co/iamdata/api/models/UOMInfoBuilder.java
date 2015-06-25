/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class UOMInfoBuilder {
    //the instance to build
    private UOMInfo uOMInfo;

	/**
     * Default constructor to initialize the instance
     */
    public UOMInfoBuilder() {
        uOMInfo = new UOMInfo();
    }

    public UOMInfoBuilder description(String description) {
        uOMInfo.setDescription(description);
        return this;
    }

    public UOMInfoBuilder name(String name) {
        uOMInfo.setName(name);
        return this;
    }

    public UOMInfoBuilder id(Integer id) {
        uOMInfo.setId(id);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public UOMInfo build() {
		return uOMInfo;
	}
}