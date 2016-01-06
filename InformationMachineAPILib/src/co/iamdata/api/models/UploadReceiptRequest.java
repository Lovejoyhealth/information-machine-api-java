/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UploadReceiptRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5109821571062668384L;
    private String image;
    private String receiptId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("image")
    public String getImage ( ) { 
        return this.image;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("image")
    public void setImage (String value) { 
        this.image = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("receipt_id")
    public String getReceiptId ( ) { 
        return this.receiptId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("receipt_id")
    public void setReceiptId (String value) { 
        this.receiptId = value;
    }
 
}
 