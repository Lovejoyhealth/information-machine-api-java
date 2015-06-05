/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UploadBarcodeResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4724626722573850123L;
    private String barCode;
    private String barCodeType;
    private ProductData apiProduct;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bar_code")
    public String getBarCode ( ) { 
        return this.barCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bar_code")
    public void setBarCode (String value) { 
        this.barCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bar_code_type")
    public String getBarCodeType ( ) { 
        return this.barCodeType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bar_code_type")
    public void setBarCodeType (String value) { 
        this.barCodeType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("apiProduct")
    public ProductData getApiProduct ( ) { 
        return this.apiProduct;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("apiProduct")
    public void setApiProduct (ProductData value) { 
        this.apiProduct = value;
    }
 
}
 