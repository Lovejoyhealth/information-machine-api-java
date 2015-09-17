/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class ProductDataBuilder {
    //the instance to build
    private ProductData productData;

    /**
     * Default constructor to initialize the instance
     */
    public ProductDataBuilder() {
        productData = new ProductData();
    }

    public ProductDataBuilder amazonLink(String amazonLink) {
        productData.setAmazonLink(amazonLink);
        return this;
    }

    public ProductDataBuilder brand(String brand) {
        productData.setBrand(brand);
        return this;
    }

    public ProductDataBuilder category(String category) {
        productData.setCategory(category);
        return this;
    }

    public ProductDataBuilder categoryId(Integer categoryId) {
        productData.setCategoryId(categoryId);
        return this;
    }

    public ProductDataBuilder description(String description) {
        productData.setDescription(description);
        return this;
    }

    public ProductDataBuilder id(Integer id) {
        productData.setId(id);
        return this;
    }

    public ProductDataBuilder ingredients(String ingredients) {
        productData.setIngredients(ingredients);
        return this;
    }

    public ProductDataBuilder ingredientsCount(Integer ingredientsCount) {
        productData.setIngredientsCount(ingredientsCount);
        return this;
    }

    public ProductDataBuilder largeImage(String largeImage) {
        productData.setLargeImage(largeImage);
        return this;
    }

    public ProductDataBuilder manufacturer(String manufacturer) {
        productData.setManufacturer(manufacturer);
        return this;
    }

    public ProductDataBuilder name(String name) {
        productData.setName(name);
        return this;
    }

    public ProductDataBuilder nutrients(List<NutrientData> nutrients) {
        productData.setNutrients(nutrients);
        return this;
    }

    public ProductDataBuilder recipes(List<String> recipes) {
        productData.setRecipes(recipes);
        return this;
    }

    public ProductDataBuilder score(Double score) {
        productData.setScore(score);
        return this;
    }

    public ProductDataBuilder servingSize(String servingSize) {
        productData.setServingSize(servingSize);
        return this;
    }

    public ProductDataBuilder servingSizeInGrams(Double servingSizeInGrams) {
        productData.setServingSizeInGrams(servingSizeInGrams);
        return this;
    }

    public ProductDataBuilder servingSizeUnit(String servingSizeUnit) {
        productData.setServingSizeUnit(servingSizeUnit);
        return this;
    }

    public ProductDataBuilder servingsPerContainer(String servingsPerContainer) {
        productData.setServingsPerContainer(servingsPerContainer);
        return this;
    }

    public ProductDataBuilder smallImage(String smallImage) {
        productData.setSmallImage(smallImage);
        return this;
    }

    public ProductDataBuilder tags(List<String> tags) {
        productData.setTags(tags);
        return this;
    }

    public ProductDataBuilder upc(String upc) {
        productData.setUpc(upc);
        return this;
    }

    public ProductDataBuilder visibilityCount(Integer visibilityCount) {
        productData.setVisibilityCount(visibilityCount);
        return this;
    }

    public ProductDataBuilder weight(String weight) {
        productData.setWeight(weight);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ProductData build() {
        return productData;
    }
}