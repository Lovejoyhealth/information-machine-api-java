/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class UploadBarcodeRequestBuilder {
    //the instance to build
    private UploadBarcodeRequest uploadBarcodeRequest;

	/**
     * Default constructor to initialize the instance
     */
    public UploadBarcodeRequestBuilder() {
        uploadBarcodeRequest = new UploadBarcodeRequest();
    }

    public UploadBarcodeRequestBuilder barCode(String barCode) {
        uploadBarcodeRequest.setBarCode(barCode);
        return this;
    }

    public UploadBarcodeRequestBuilder barCodeType(String barCodeType) {
        uploadBarcodeRequest.setBarCodeType(barCodeType);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public UploadBarcodeRequest build() {
		return uploadBarcodeRequest;
	}
}