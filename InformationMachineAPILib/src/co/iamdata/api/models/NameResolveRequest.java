/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NameResolveRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4812905207172716379L;
    private List<String> nameStoreList;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name_store_list")
    public List<String> getNameStoreList ( ) { 
        return this.nameStoreList;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name_store_list")
    public void setNameStoreList (List<String> value) { 
        this.nameStoreList = value;
    }
 
}
 