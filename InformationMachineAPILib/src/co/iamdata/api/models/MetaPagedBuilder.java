/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

public class MetaPagedBuilder {
    //the instance to build
    private MetaPaged metaPaged;

	/**
     * Default constructor to initialize the instance
     */
    public MetaPagedBuilder() {
        metaPaged = new MetaPaged();
    }

    public MetaPagedBuilder page(Integer page) {
        metaPaged.setPage(page);
        return this;
    }

    public MetaPagedBuilder perPage(Integer perPage) {
        metaPaged.setPerPage(perPage);
        return this;
    }

    public MetaPagedBuilder totalCount(Integer totalCount) {
        metaPaged.setTotalCount(totalCount);
        return this;
    }

    public MetaPagedBuilder nextPage(String nextPage) {
        metaPaged.setNextPage(nextPage);
        return this;
    }

    public MetaPagedBuilder lastPage(String lastPage) {
        metaPaged.setLastPage(lastPage);
        return this;
    }

    public MetaPagedBuilder maxNumberOfRequestsPerMinute(Integer maxNumberOfRequestsPerMinute) {
        metaPaged.setMaxNumberOfRequestsPerMinute(maxNumberOfRequestsPerMinute);
        return this;
    }

    public MetaPagedBuilder remainingNumberOfRequest(Integer remainingNumberOfRequest) {
        metaPaged.setRemainingNumberOfRequest(remainingNumberOfRequest);
        return this;
    }

    public MetaPagedBuilder timeInEpochSecondTillReset(Double timeInEpochSecondTillReset) {
        metaPaged.setTimeInEpochSecondTillReset(timeInEpochSecondTillReset);
        return this;
    }

    /**
     * Build the instance with the given values
     */
	public MetaPaged build() {
		return metaPaged;
	}
}