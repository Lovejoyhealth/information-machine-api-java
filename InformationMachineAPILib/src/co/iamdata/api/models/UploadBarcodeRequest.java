/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UploadBarcodeRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5336436600136303904L;
    private String barCode;
    private String barCodeType;
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
 
}
 