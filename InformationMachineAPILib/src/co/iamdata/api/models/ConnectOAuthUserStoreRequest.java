/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ConnectOAuthUserStoreRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4958674324441601479L;
    private String oauthProvider;
    private int storeId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("oauth_provider")
    public String getOauthProvider ( ) { 
        return this.oauthProvider;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("oauth_provider")
    public void setOauthProvider (String value) { 
        this.oauthProvider = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("store_id")
    public int getStoreId ( ) { 
        return this.storeId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("store_id")
    public void setStoreId (int value) { 
        this.storeId = value;
    }
 
}
 