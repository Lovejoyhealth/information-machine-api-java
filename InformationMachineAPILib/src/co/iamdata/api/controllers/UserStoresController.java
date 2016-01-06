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
     * Get all store connections for a specified user, must identify user by "user_id". Note: Within response focus on the following  properties: "scrape_status" and "credentials_status". Possible values for "scrape_status": "Not defined""Pending" - (scraping request is in queue and waiting to be processed)"Scraping" - (scraping is in progress)"Done" - (scraping is finished)"Done With Warning" - (not all purchases were scraped)Possible values for "credentials_status":"Not defined""Verified" - (scraping bots are able to log in to store site)"Invalid" - (supplied user name or password are not valid)"Unknown" - (user name or password are not know)"Checking" - (credentials verification is in progress)To get the value of credentials_status first check if scrape_status is one of the following: "Scraping", "Done", "Done With Warning"Sometimes the account can be locked because a security question, image captcha or sms verification code is needed in order to proceed with scraping.You can check whether the account is locked if property account_locked is set to true. To unlock the store connection visit the url the can be found in unlock_url property.For more information on this please visit the <a href="https://www.iamdata.co/docs?section=user-stores-section#userstoreunlock">docs</a> page.
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
            private static final long serialVersionUID = 4917436442577776367L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5148540907526557673L;
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
            private static final long serialVersionUID = 4957383760435338901L;
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
        GetAllStoresWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetAllStoresWrapper>(){});

        return result;
    }
        
    /**
     * Connect a user's store by specifying the user ID ("user_id"), store ID ("store_id") and user's credentials for specified store ("username" and "password"). You can find store IDs in Lookup/Stores section above or in this <a href="http://api.iamdata.co/docs/storeids" target="blank">LINK</a>. Note: Within response you should focus on the following properties: "scrape_status" and "credentials_status". Possible values for "scrape_status": "Not defined""Pending" - (scraping request is in queue and waiting to be processed)"Scraping" - (scraping is in progress, credentials are set)"Done" - (scraping is finished)"Done With Warning" - (not all purchases were scraped)Possible values for "credentials_status":"Not defined""Verified" - (scraping bots are able to log in to store site)"Invalid" - (supplied user name or password are not valid)"Unknown" - (user name or password are not know)"Checking" - (credentials verification is in progress)To get the value of credentials_status first check if scrape_status is one of the following: "Scraping", "Done", "DoneWithWarning"
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
            private static final long serialVersionUID = 4667055518905376372L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5472221485171543745L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5407199243586116377L;
            {
                    put( "user-agent", "IAMDATA V1" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.postBody(queryUrl, headers, APIHelper.serialize(payload));

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
        ConnectStoreWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<ConnectStoreWrapper>(){});

        return result;
    }
        
    /**
     * Connect a user's store by specifying the user ID ("user_id"), store ID ("store_id") and OAuth2 provider (such as GMailAPI) You can find store IDs in Lookup/Stores section above or in this <a href="http://api.iamdata.co/docs/storeids" target="blank">LINK</a>. Note: Within response you should focus on the following properties: "scrape_status", "credentials_status" and OAuth providers where you will find a url link for authorization. Possible values for "scrape_status": "Not defined""Pending" - (scraping request is in queue and waiting to be processed)"Scraping" - (scraping is in progress)"Done" - (scraping is finished)"Done With Warning" - (not all purchases were scraped)Possible values for "credentials_status":"Not defined""Verified" - (scraping bots are able to log in to store site)"Invalid" - (supplied user name or password are not valid)"Unknown" - (user name or password are not know)"Checking" - (credentials verification is in progress)To get the value of credentials_status first check if scrape_status is one of the following: "Scraping", "Done", "DoneWithWarning"
     * @param    payload    Required parameter: TODO: type description here
     * @param    userId    Required parameter: TODO: type description here
	 * @return	Returns the ConnectStoreWrapper response from the API call*/
    public ConnectStoreWrapper userStoresConnectOAuthStore(
            final ConnectOAuthUserStoreRequest payload,
            final String userId
    ) throws IOException, APIException, JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/stores/oauth");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5237268951436140755L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5326411789266043039L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4937170890329009621L;
            {
                    put( "user-agent", "IAMDATA V1" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.postBody(queryUrl, headers, APIHelper.serialize(payload));

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
        ConnectStoreWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<ConnectStoreWrapper>(){});

        return result;
    }
        
    /**
     * Get single store connection by specifying user ("user_id") and store connection ID ("id" - generated upon successful store connection). Note: Within response focus on the following properties: "scrape_status" and "credentials_status". Possible values for "scrape_status": "Not defined""Pending" - (scraping request is in queue and waiting to be processed)"Scraping" - (scraping is in progress)"Done" - (scraping is finished)"Done With Warning" - (not all purchases were scraped)Possible values for "credentials_status":"Not defined""Verified" - (scraping bots are able to log in to store site)"Invalid" - (supplied user name or password are not valid)"Unknown" - (user name or password are not know)"Checking" - (credentials verification is in progress)To get the value of credentials_status first check if scrape_status is one of the following: "Scraping", "Done", "Done With Warning"Sometimes the account can be locked because a security question, image captcha or sms verification code is needed in order to proceed with scraping.You can check whether the account is locked if property account_locked is set to true. To unlock the store connection visit the url the can be found in unlock_url property.For more information on this please visit the <a href="https://www.iamdata.co/docs?section=user-stores-section#userstoreunlock">docs</a> page.
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
            private static final long serialVersionUID = 5441192881534781884L;
            {
                    put( "user_id", userId );
                    put( "id", id );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5420104986878636023L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5668436622813405924L;
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
        GetSingleStoresWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
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
            private static final long serialVersionUID = 4732618472586330080L;
            {
                    put( "user_id", userId );
                    put( "id", id );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5255400320276642131L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5278929859169358818L;
            {
                    put( "user-agent", "IAMDATA V1" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.putBody(queryUrl, headers, APIHelper.serialize(payload));

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
        UpdateStoreConnectionWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
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
            private static final long serialVersionUID = 5005004442937367437L;
            {
                    put( "user_id", userId );
                    put( "id", id );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5211481812772035910L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5399589955629902705L;
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
        DeleteSingleStoreWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<DeleteSingleStoreWrapper>(){});

        return result;
    }
        
}