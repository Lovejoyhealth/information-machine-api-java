/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProductData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4737807778780827102L;
    private List<NutrientData> nutrients;
    private List<String> recipes;
    private Integer visibilityCount;
    private Double score;
    private String amazonLink;
    private String manufacturer;
    private Integer ingredientsCount;
    private String largeImage;
    private String smallImage;
    private Double servingSizeInGrams;
    private String servingSizeUnit;
    private String servingsPerContainer;
    private String servingSize;
    private String ingredients;
    private String weight;
    private String description;
    private String brand;
    private String upc;
    private List<String> tags;
    private String category;
    private Integer categoryId;
    private String name;
    private Integer id;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("nutrients")
    public List<NutrientData> getNutrients ( ) { 
        return this.nutrients;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("nutrients")
    public void setNutrients (List<NutrientData> value) { 
        this.nutrients = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recipes")
    public List<String> getRecipes ( ) { 
        return this.recipes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recipes")
    public void setRecipes (List<String> value) { 
        this.recipes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("visibility_count")
    public Integer getVisibilityCount ( ) { 
        return this.visibilityCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("visibility_count")
    public void setVisibilityCount (Integer value) { 
        this.visibilityCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("score")
    public Double getScore ( ) { 
        return this.score;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("score")
    public void setScore (Double value) { 
        this.score = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("amazon_link")
    public String getAmazonLink ( ) { 
        return this.amazonLink;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("amazon_link")
    public void setAmazonLink (String value) { 
        this.amazonLink = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("manufacturer")
    public String getManufacturer ( ) { 
        return this.manufacturer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("manufacturer")
    public void setManufacturer (String value) { 
        this.manufacturer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ingredients_count")
    public Integer getIngredientsCount ( ) { 
        return this.ingredientsCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ingredients_count")
    public void setIngredientsCount (Integer value) { 
        this.ingredientsCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("large_image")
    public String getLargeImage ( ) { 
        return this.largeImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("large_image")
    public void setLargeImage (String value) { 
        this.largeImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("small_image")
    public String getSmallImage ( ) { 
        return this.smallImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("small_image")
    public void setSmallImage (String value) { 
        this.smallImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("serving_size_in_grams")
    public Double getServingSizeInGrams ( ) { 
        return this.servingSizeInGrams;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("serving_size_in_grams")
    public void setServingSizeInGrams (Double value) { 
        this.servingSizeInGrams = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("serving_size_unit")
    public String getServingSizeUnit ( ) { 
        return this.servingSizeUnit;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("serving_size_unit")
    public void setServingSizeUnit (String value) { 
        this.servingSizeUnit = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("servings_per_container")
    public String getServingsPerContainer ( ) { 
        return this.servingsPerContainer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("servings_per_container")
    public void setServingsPerContainer (String value) { 
        this.servingsPerContainer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("serving_size")
    public String getServingSize ( ) { 
        return this.servingSize;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("serving_size")
    public void setServingSize (String value) { 
        this.servingSize = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ingredients")
    public String getIngredients ( ) { 
        return this.ingredients;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ingredients")
    public void setIngredients (String value) { 
        this.ingredients = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("weight")
    public String getWeight ( ) { 
        return this.weight;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("weight")
    public void setWeight (String value) { 
        this.weight = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("brand")
    public String getBrand ( ) { 
        return this.brand;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("brand")
    public void setBrand (String value) { 
        this.brand = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("upc")
    public String getUpc ( ) { 
        return this.upc;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("upc")
    public void setUpc (String value) { 
        this.upc = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tags")
    public List<String> getTags ( ) { 
        return this.tags;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tags")
    public void setTags (List<String> value) { 
        this.tags = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("category")
    public String getCategory ( ) { 
        return this.category;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("category")
    public void setCategory (String value) { 
        this.category = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("category_id")
    public Integer getCategoryId ( ) { 
        return this.categoryId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("category_id")
    public void setCategoryId (Integer value) { 
        this.categoryId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public Integer getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (Integer value) { 
        this.id = value;
    }
 
}
 