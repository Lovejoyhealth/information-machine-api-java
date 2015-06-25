/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.controllers;

import java.io.*;
import java.util.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import co.iamdata.api.http.client.HttpClient;
import co.iamdata.api.http.request.HttpRequest;
import co.iamdata.api.http.response.HttpResponse;
import co.iamdata.api.http.response.HttpStringResponse;
import co.iamdata.api.*;
import co.iamdata.api.models.*;

public class UserStoresController extends BaseController {

    //private fields for configuration

   /** Id of your app */
    private String clientId;

   /** Secret key which authorizes you to use this API */
    private String clientSecret;

   /**
    * Constructor with authentication and configuration parameters */
    public UserStoresController (String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public UserStoresController (HttpClient _client, String clientId, String clientSecret) {
        super(_client);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Get all store connections for a specified user, must identify user by "user_id". Note: Within response focus on the following  properties: "scrape_status" and "credentials_status". Possible values for "scrape_status": "Not defined""Pending" - (scraping request is in queue and waiting to be processed)"Scraping" - (scraping is in progress)"Done" - (scraping is finished)"Done With Warning" - (not all purchases were scraped)Possible values for "credentials_status":"Not defined""Verified" - (scraping bots are able to log in to store site)"Invalid" - (supplied user name or password are not valid)"Unknown" - (user name or password are not know)"Checking" - (credentials verification is in progress)
     * @param    userId    Required parameter: TODO: type description here
     * @param    page    Optional parameter: TODO: type description here
     * @param    perPage    Optional parameter: TODO: type description here
	 * @return	Returns the GetAllStoresWrapper response from the API call*/
    public GetAllStoresWrapper userStoresGetAllStores(
            final String userId,
            final Integer page,
            final Integer perPage
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/stores");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5306918913432810251L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4733661868210794737L;
            {
                    put( "page", page );
                    put( "per_page", perPage );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5596394120348008929L;
            {
                    put( "user-agent", "IAMDATA V1" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if (responseCode == 404)
            throw new APIException("Not Found", 404, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetAllStoresWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetAllStoresWrapper>(){});

        return result;
    }
        
    /**
     * Connect a user's store by specifying the user ID ("user_id"), store ID ("store_id") and user's credentials for specified store ("username" and "password"). Note: Within response you should focus on the following properties: "scrape_status" and "credentials_status". Possible values for "scrape_status": "Not defined""Pending" - (scraping request is in queue and waiting to be processed)"Scraping" - (scraping is in progress)"Done" - (scraping is finished)"Done With Warning" - (not all purchases were scraped)Possible values for "credentials_status":"Not defined""Verified" - (scraping bots are able to log in to store site)"Invalid" - (supplied user name or password are not valid)"Unknown" - (user name or password are not know)"Checking" - (credentials verification is in progress)
     * @param    payload    Required parameter: TODO: type description here
     * @param    userId    Required parameter: TODO: type description here
	 * @return	Returns the ConnectStoreWrapper response from the API call*/
    public ConnectStoreWrapper userStoresConnectStore(
            final ConnectUserStoreRequest payload,
            final String userId
    ) throws IOException, APIException, JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/stores");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4716276911711361387L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5005493708074390695L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5504474160401389294L;
            {
                    put( "user-agent", "IAMDATA V1" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.postBody(queryUrl, headers, APIHelper.jsonSerialize(payload));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if (responseCode == 400)
            throw new APIException("Bad request", 400, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if (responseCode == 404)
            throw new APIException("Not Found", 404, response.getRawBody());

        else if (responseCode == 500)
            throw new APIException("Internal Server Error", 500, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        ConnectStoreWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<ConnectStoreWrapper>(){});

        return result;
    }
        
    /**
     * Get single store connection by specifying user ("user_id") and store connection ID ("user_store_id" - generated upon successful store connection). Note: Within response focus on the following properties: "scrape_status" and "credentials_status". Possible values for "scrape_status": "Not defined""Pending" - (scraping request is in queue and waiting to be processed)"Scraping" - (scraping is in progress)"Done" - (scraping is finished)"Done With Warning" - (not all purchases were scraped)Possible values for "credentials_status":"Not defined""Verified" - (scraping bots are able to log in to store site)"Invalid" - (supplied user name or password are not valid)"Unknown" - (user name or password are not know)"Checking" - (credentials verification is in progress)
     * @param    userId    Required parameter: TODO: type description here
     * @param    id    Required parameter: TODO: type description here
	 * @return	Returns the GetSingleStoresWrapper response from the API call*/
    public GetSingleStoresWrapper userStoresGetSingleStore(
            final String userId,
            final int id
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/stores/{id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4873801537016735019L;
            {
                    put( "user_id", userId );
                    put( "id", id );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5420212323289298476L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5584801455802123050L;
            {
                    put( "user-agent", "IAMDATA V1" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if (responseCode == 404)
            throw new APIException("Not Found", 404, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetSingleStoresWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetSingleStoresWrapper>(){});

        return result;
    }
        
    /**
     * Update username and/or password of existing store connection, for a specified user ID ("user_id") and user store ID ("user_store_id"  - generated on store connect).
     * @param    payload    Required parameter: TODO: type description here
     * @param    userId    Required parameter: TODO: type description here
     * @param    id    Required parameter: TODO: type description here
	 * @return	Returns the UpdateStoreConnectionWrapper response from the API call*/
    public UpdateStoreConnectionWrapper userStoresUpdateStoreConnection(
            final UpdateUserStoreRequest payload,
            final String userId,
            final int id
    ) throws IOException, APIException, JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/stores/{id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5502291224605191765L;
            {
                    put( "user_id", userId );
                    put( "id", id );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5081492829156192657L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5547025565455238936L;
            {
                    put( "user-agent", "IAMDATA V1" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.putBody(queryUrl, headers, APIHelper.jsonSerialize(payload));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if (responseCode == 404)
            throw new APIException("Not Found", 404, response.getRawBody());

        else if (responseCode == 500)
            throw new APIException("Internal Server Error", 500, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        UpdateStoreConnectionWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<UpdateStoreConnectionWrapper>(){});

        return result;
    }
        
    /**
     * Delete store connection for a specified user ("user_id") and specified store ("user_store_id"  - generated on store connect).
     * @param    userId    Required parameter: TODO: type description here
     * @param    id    Required parameter: TODO: type description here
	 * @return	Returns the DeleteSingleStoreWrapper response from the API call*/
    public DeleteSingleStoreWrapper userStoresDeleteSingleStore(
            final String userId,
            final int id
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/stores/{id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5176869937312665025L;
            {
                    put( "user_id", userId );
                    put( "id", id );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5040088242251079213L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5569443393853603837L;
            {
                    put( "user-agent", "IAMDATA V1" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.delete(queryUrl, headers, null);

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if (responseCode == 500)
            throw new APIException("Internal Server Error", 500, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        DeleteSingleStoreWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<DeleteSingleStoreWrapper>(){});

        return result;
    }
        
}