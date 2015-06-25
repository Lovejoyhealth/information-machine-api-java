/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.List;
public class GetAllUsersWrapperBuilder {
    //the instance to build
    private GetAllUsersWrapper getAllUsersWrapper;

	/**
     * Default constructor to initialize the instance
     */
    public GetAllUsersWrapperBuilder() {
        getAllUsersWrapper = new GetAllUsersWrapper();
    }

    public GetAllUsersWrapperBuilder result(List<UserData> result) {
        getAllUsersWrapper.setResult(result);
        return this;
    }

    public GetAllUsersWrapperBuilder meta(MetaPaged meta) {
        getAllUsersWrapper.setMeta(meta);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public GetAllUsersWrapper build() {
		return getAllUsersWrapper;
	}
}