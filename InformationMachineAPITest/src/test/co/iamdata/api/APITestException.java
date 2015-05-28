package test.co.iamdata.api;

public class APITestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7339363519240825392L;
	
	/**
     * Initialization constructor
     * @param	reason	The reason for throwing exception
     */
    public APITestException(String reason) {
        super(reason);
    }
}
