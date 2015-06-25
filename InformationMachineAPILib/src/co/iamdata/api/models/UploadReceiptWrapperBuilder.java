/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class UploadReceiptWrapperBuilder {
    //the instance to build
    private UploadReceiptWrapper uploadReceiptWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public UploadReceiptWrapperBuilder() {
        uploadReceiptWrapper = new UploadReceiptWrapper();
    }

    public UploadReceiptWrapperBuilder result(String result) {
        uploadReceiptWrapper.setResult(result);
        return this;
    }

    public UploadReceiptWrapperBuilder meta(MetaBase meta) {
        uploadReceiptWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public UploadReceiptWrapper build() {
		return uploadReceiptWrapper;
	}
}