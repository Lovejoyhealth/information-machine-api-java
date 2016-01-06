/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserData 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5748892239464402183L;
    private String createdAt;
    private String email;
    private String ownerAppId;
    private String userId;
    private String zip;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    public String getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    public void setCreatedAt (String value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("owner_app_id")
    public String getOwnerAppId ( ) { 
        return this.ownerAppId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("owner_app_id")
    public void setOwnerAppId (String value) { 
        this.ownerAppId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("user_id")
    public String getUserId ( ) { 
        return this.userId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("user_id")
    public void setUserId (String value) { 
        this.userId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("zip")
    public String getZip ( ) { 
        return this.zip;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("zip")
    public void setZip (String value) { 
        this.zip = value;
    }
 
}
 