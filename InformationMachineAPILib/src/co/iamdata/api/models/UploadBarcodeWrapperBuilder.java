/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class UploadBarcodeWrapperBuilder {
    //the instance to build
    private UploadBarcodeWrapper uploadBarcodeWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public UploadBarcodeWrapperBuilder() {
        uploadBarcodeWrapper = new UploadBarcodeWrapper();
    }

    public UploadBarcodeWrapperBuilder result(UploadBarcodeResponse result) {
        uploadBarcodeWrapper.setResult(result);
        return this;
    }

    public UploadBarcodeWrapperBuilder meta(MetaBase meta) {
        uploadBarcodeWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public UploadBarcodeWrapper build() {
		return uploadBarcodeWrapper;
	}
}