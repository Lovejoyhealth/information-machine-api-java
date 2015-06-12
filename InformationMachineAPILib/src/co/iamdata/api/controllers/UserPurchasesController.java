/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.controllers;

import java.io.*;
import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;

import co.iamdata.api.http.client.HttpClient;
import co.iamdata.api.http.request.HttpRequest;
import co.iamdata.api.http.response.HttpResponse;
import co.iamdata.api.http.response.HttpStringResponse;
import co.iamdata.api.*;
import co.iamdata.api.models.*;

public class UserPurchasesController extends BaseController {

    //private fields for configuration

   /** Id of your app */
    private String clientId;

   /** Secret key which authorizes you to use this API */
    private String clientSecret;

   /**
    * Constructor with authentication and configuration parameters */
    public UserPurchasesController (String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public UserPurchasesController (HttpClient _client, String clientId, String clientSecret) {
        super(_client);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Get details about an identified purchase (specify "purchase_id") made my a specific user (specify "user_id").
     * @param    userId    Required parameter: TODO: type description here
     * @param    purchaseId    Required parameter: TODO: type description here
     * @param    fullResp    Optional parameter: default:false (set true for response with purchase item details)
	 * @return	Returns the GetSingleUserPurchaseWrapper response from the API call*/
    public GetSingleUserPurchaseWrapper userPurchasesGetSingleUserPurchase(
            final String userId,
            final String purchaseId,
            final Boolean fullResp
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/purchases/{purchase_id}");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4998304260465935841L;
            {
                    put( "user_id", userId );
                    put( "purchase_id", purchaseId );
            }});

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5045674204468957714L;
            {
                    put( "full_resp", fullResp );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4954094314891299804L;
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
        if (responseCode == 404)
            throw new APIException("Not Found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetSingleUserPurchaseWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetSingleUserPurchaseWrapper>(){});

        return result;
    }
        
    /**
     * Get full history of purchases made by a specified user from connected stores, must specify "user_id".
     * @param    userId    Required parameter: TODO: type description here
     * @param    page    Optional parameter: TODO: type description here
     * @param    perPage    Optional parameter: default:10, max:50
     * @param    purchaseDateBefore    Optional parameter: yyyy-MM-dd [e.g., 2015-04-18]
     * @param    purchaseDateAfter    Optional parameter: yyyy-MM-dd [e.g., 2015-04-18]
     * @param    purchaseTotalLess    Optional parameter: TODO: type description here
     * @param    purchaseTotalGreater    Optional parameter: TODO: type description here
     * @param    fullResp    Optional parameter: default:false (set true for response with purchase item details)
	 * @return	Returns the GetAllUserPurchasesWrapper response from the API call*/
    public GetAllUserPurchasesWrapper userPurchasesGetAllUserPurchases(
            final String userId,
            final Integer page,
            final Integer perPage,
            final String purchaseDateBefore,
            final String purchaseDateAfter,
            final Double purchaseTotalLess,
            final Double purchaseTotalGreater,
            final Boolean fullResp
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/purchases");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5301474804194711182L;
            {
                    put( "user_id", userId );
            }});

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5171350919439905697L;
            {
                    put( "page", page );
                    put( "per_page", perPage );
                    put( "purchase_date_before", purchaseDateBefore );
                    put( "purchase_date_after", purchaseDateAfter );
                    put( "purchase_total_less", purchaseTotalLess );
                    put( "purchase_total_greater", purchaseTotalGreater );
                    put( "full_resp", fullResp );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5528200618736883856L;
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
        if (responseCode == 404)
            throw new APIException("Not Found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetAllUserPurchasesWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetAllUserPurchasesWrapper>(){});

        return result;
    }
        
}