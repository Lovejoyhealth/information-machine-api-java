/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class NameUpcRecordBuilder {
    //the instance to build
    private NameUpcRecord nameUpcRecord;

    /**
     * Default constructor to initialize the instance
     */
    public NameUpcRecordBuilder() {
        nameUpcRecord = new NameUpcRecord();
    }

    public NameUpcRecordBuilder name(String name) {
        nameUpcRecord.setName(name);
        return this;
    }

    public NameUpcRecordBuilder resolveStatus(String resolveStatus) {
        nameUpcRecord.setResolveStatus(resolveStatus);
        return this;
    }

    public NameUpcRecordBuilder store(String store) {
        nameUpcRecord.setStore(store);
        return this;
    }

    public NameUpcRecordBuilder upcs(List<String> upcs) {
        nameUpcRecord.setUpcs(upcs);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public NameUpcRecord build() {
        return nameUpcRecord;
    }
}