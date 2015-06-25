/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class ProductAlternativeTypeInfoBuilder {
    //the instance to build
    private ProductAlternativeTypeInfo productAlternativeTypeInfo;

	/**
     * Default constructor to initialize the instance
     */
    public ProductAlternativeTypeInfoBuilder() {
        productAlternativeTypeInfo = new ProductAlternativeTypeInfo();
    }

    public ProductAlternativeTypeInfoBuilder description(String description) {
        productAlternativeTypeInfo.setDescription(description);
        return this;
    }

    public ProductAlternativeTypeInfoBuilder name(String name) {
        productAlternativeTypeInfo.setName(name);
        return this;
    }

    public ProductAlternativeTypeInfoBuilder id(Integer id) {
        productAlternativeTypeInfo.setId(id);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public ProductAlternativeTypeInfo build() {
		return productAlternativeTypeInfo;
	}
}