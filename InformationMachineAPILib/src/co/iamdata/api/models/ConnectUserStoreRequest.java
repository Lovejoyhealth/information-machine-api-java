/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ConnectUserStoreRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4931717933970765136L;
    private String password;
    private int storeId;
    private String username;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
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
 