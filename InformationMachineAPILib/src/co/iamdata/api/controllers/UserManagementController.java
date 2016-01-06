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

public class UserManagementController extends BaseController {

    //private fields for configuration

   /** Id of your app */
    private String clientId;

   /** Secret key which authorizes you to use this API */
    private String clientSecret;

   /**
    * Constructor with authentication and configuration parameters */
    public UserManagementController (String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public UserManagementController (HttpClient _client, String clientId, String clientSecret) {
        super(_client);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Get all users associated with your account.
     * @param    page    Optional parameter: TODO: type description here
     * @param    perPage    Optional parameter: default:10, max:50
	 * @return	Returns the GetAllUsersWrapper response from the API call*/
    public GetAllUsersWrapper userManagementGetAllUsers(
            final Integer page,
            final Integer perPage
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5108580370242814786L;
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
            private static final long serialVersionUID = 5602203503599190282L;
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
        if (responseCode == 400)
            throw new APIException("Bad request", 400, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetAllUsersWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetAllUsersWrapper>(){});

        return result;
    }
        
    /**
     * Register a new user by specifying "email", "zip" and "user_id". The "user_id" is mandatory and it represents the identifier you will use to identify your user in the IM API infrastructure.Note: The following characters are restricted within "user_id" string ---&gt; { '/', '^', '[',  '\\', 'w', '.', ']', '+', '$', '/' }
     * @param    payload    Required parameter: TODO: type description here
	 * @return	Returns the CreateUserWrapper response from the API call*/
    public CreateUserWrapper userManagementCreateUser(
            final RegisterUserRequest payload
    ) throws IOException, APIException, JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4617725255220814298L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5603000181819184640L;
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

        else if (responseCode == 422)
            throw new APIException("Unprocessable entity", 422, response.getRawBody());

        else if (responseCode == 500)
            throw new APIException("Internal Server Error", 500, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        CreateUserWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<CreateUserWrapper>(){});

        return result;
    }
        
    /**
     * Delete a user from the IM API infrastructure by specifying user's "id".
     * @param    id    Required parameter: TODO: type description here
	 * @return	Returns the DeleteUserWrapper response from the API call*/
    public DeleteUserWrapper userManagementDeleteUser(
            final String id
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4658481101304877314L;
            {
                    put( "id", id );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5155286482772728844L;
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
        if (responseCode == 404)
            throw new APIException("Not found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        DeleteUserWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<DeleteUserWrapper>(){});

        return result;
    }
        
    /**
     * Get user associated with your account specifying "id" of a user.
     * @param    id    Required parameter: TODO: type description here
	 * @return	Returns the GetSingleUserWrapper response from the API call*/
    public GetSingleUserWrapper userManagementGetSingleUser(
            final String id
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4949156065001607530L;
            {
                    put( "id", id );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5646835515202178495L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4940136161343875210L;
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
        GetSingleUserWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetSingleUserWrapper>(){});

        return result;
    }
        
}