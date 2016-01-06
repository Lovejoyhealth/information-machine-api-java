/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserStore 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4727298628572251166L;
    private Boolean accountLocked;
    private String createdAt;
    private String credentialsStatus;
    private Integer id;
    private String oauthAuthorizationUrl;
    private String oauthProvider;
    private String scrapeStatus;
    private String storeName;
    private Integer supermarketId;
    private String type;
    private String unlockUrl;
    private String updatedAt;
    private UserData user;
    private String username;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("account_locked")
    public Boolean getAccountLocked ( ) { 
        return this.accountLocked;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("account_locked")
    public void setAccountLocked (Boolean value) { 
        this.accountLocked = value;
    }
 
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
    @JsonGetter("credentials_status")
    public String getCredentialsStatus ( ) { 
        return this.credentialsStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("credentials_status")
    public void setCredentialsStatus (String value) { 
        this.credentialsStatus = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("oauth_authorization_url")
    public String getOauthAuthorizationUrl ( ) { 
        return this.oauthAuthorizationUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("oauth_authorization_url")
    public void setOauthAuthorizationUrl (String value) { 
        this.oauthAuthorizationUrl = value;
    }
 
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
    @JsonGetter("scrape_status")
    public String getScrapeStatus ( ) { 
        return this.scrapeStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("scrape_status")
    public void setScrapeStatus (String value) { 
        this.scrapeStatus = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("store_name")
    public String getStoreName ( ) { 
        return this.storeName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("store_name")
    public void setStoreName (String value) { 
        this.storeName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("supermarket_id")
    public Integer getSupermarketId ( ) { 
        return this.supermarketId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("supermarket_id")
    public void setSupermarketId (Integer value) { 
        this.supermarketId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("unlock_url")
    public String getUnlockUrl ( ) { 
        return this.unlockUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("unlock_url")
    public void setUnlockUrl (String value) { 
        this.unlockUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (String value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("user")
    public UserData getUser ( ) { 
        return this.user;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("user")
    public void setUser (UserData value) { 
        this.user = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
}
 