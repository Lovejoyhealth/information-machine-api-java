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
     * Get history of purchases made by a specified user from connected stores, must specify "user_id".
     * @param    userId    Required parameter: TODO: type description here
     * @param    storeId    Optional parameter: Check Lookup/Stores section for ID of all stores. E.g., Amazon = 4, Walmart = 3.
     * @param    foodOnly    Optional parameter: default:false [Filter out food purchase items.]
     * @param    upcOnly    Optional parameter: default:false [Filter out purchase items with UPC.]
     * @param    showProductDetails    Optional parameter: default:false [Show details of a purchased products (image, nutrients, ingredients, manufacturer, etc..)]
     * @param    receiptsOnly    Optional parameter: default:false [Filter out purchases transcribed from receipts.]
     * @param    upcResolvedAfter    Optional parameter: List only purchases having UPC resolved by IM after specified date. Expected format: "yyyy-MM-dd"
	 * @return	Returns the GetUserPurchaseHistoryWrapper response from the API call*/
    public GetUserPurchaseHistoryWrapper userPurchasesGetPurchaseHistoryUnified(
            final String userId,
            final Integer storeId,
            final Boolean foodOnly,
            final Boolean upcOnly,
            final Boolean showProductDetails,
            final Boolean receiptsOnly,
            final String upcResolvedAfter
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/purchases_product_based");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5663336469300307938L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5211871711677766816L;
            {
                    put( "store_id", storeId );
                    put( "food_only", foodOnly );
                    put( "upc_only", upcOnly );
                    put( "show_product_details", showProductDetails );
                    put( "receipts_only", receiptsOnly );
                    put( "upc_resolved_after", upcResolvedAfter );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5260619178069390589L;
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
        GetUserPurchaseHistoryWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetUserPurchaseHistoryWrapper>(){});

        return result;
    }
        
    /**
     * Get history of purchases made by a specified user from connected stores, must specify "user_id".
     * @param    userId    Required parameter: TODO: type description here
     * @param    storeId    Optional parameter: Check Lookup/Stores section for ID of all stores. E.g., Amazon = 4, Walmart = 3.
     * @param    page    Optional parameter: default:1
     * @param    perPage    Optional parameter: default:10, max:50
     * @param    purchaseDateFrom    Optional parameter: Define multiple date ranges by specifying "from" range date components, separated by comma ",". Equal number of "from" and "to" parameters is mandatory. Expected format: "yyyy-MM-dd, yyyy-MM-dd"e.g., "2015-04-18, 2015-06-25"
     * @param    purchaseDateTo    Optional parameter: Define multiple date ranges by specifying "to" range date components, separated by comma ",". Equal number of "from" and "to" parameters is mandatory. Expected format: "yyyy-MM-dd, yyyy-MM-dd"e.g., "2015-04-28, 2015-07-05"
     * @param    purchaseDateBefore    Optional parameter: Filter out purchases made before specified date. Expected format: yyyy-MM-dd[e.g., 2015-04-18]
     * @param    purchaseDateAfter    Optional parameter: Filter out purchases made after specified date. Expected format: yyyy-MM-dd[e.g., 2015-04-18]
     * @param    purchaseTotalFrom    Optional parameter: Define multiple total purchase price ranges by specifying "from" range price components, separated by comma ",". Equal number of "from" and "to" parameters is mandatory. Expected format: "X.YZ, X.YZ"e.g., "5.5, 16.5"
     * @param    purchaseTotalTo    Optional parameter: Define multiple total purchase price ranges by specifying "to" range price components, separated by comma ",". Equal number of "from" and "to" parameters is mandatory. Expected format: "X.YZ, X.YZ"e.g., "5.7, 20"
     * @param    purchaseTotalLess    Optional parameter: Filter out purchases with grand total price less than specified amount.
     * @param    purchaseTotalGreater    Optional parameter: Filter out purchases with grand total price greater than specified amount.
     * @param    fullResp    Optional parameter: default:false [Set true for response with purchase item details.]
     * @param    foodOnly    Optional parameter: default:false [Filter out food purchase items.]
     * @param    upcOnly    Optional parameter: default:false [Filter out purchase items with UPC.]
     * @param    receiptsOnly    Optional parameter: default:false [Filter out purchases transcribed from receipts.]
     * @param    upcResolvedAfter    Optional parameter: List only purchases having UPC resolved by IM after specified date. Expected format: "yyyy-MM-dd"
	 * @return	Returns the GetAllUserPurchasesWrapper response from the API call*/
    public GetAllUserPurchasesWrapper userPurchasesGetAllUserPurchases(
            final String userId,
            final Integer storeId,
            final Integer page,
            final Integer perPage,
            final String purchaseDateFrom,
            final String purchaseDateTo,
            final String purchaseDateBefore,
            final String purchaseDateAfter,
            final String purchaseTotalFrom,
            final String purchaseTotalTo,
            final Double purchaseTotalLess,
            final Double purchaseTotalGreater,
            final Boolean fullResp,
            final Boolean foodOnly,
            final Boolean upcOnly,
            final Boolean receiptsOnly,
            final String upcResolvedAfter
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/purchases_invoice_based");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5708517014097927110L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5052190059128245822L;
            {
                    put( "store_id", storeId );
                    put( "page", page );
                    put( "per_page", perPage );
                    put( "purchase_date_from", purchaseDateFrom );
                    put( "purchase_date_to", purchaseDateTo );
                    put( "purchase_date_before", purchaseDateBefore );
                    put( "purchase_date_after", purchaseDateAfter );
                    put( "purchase_total_from", purchaseTotalFrom );
                    put( "purchase_total_to", purchaseTotalTo );
                    put( "purchase_total_less", purchaseTotalLess );
                    put( "purchase_total_greater", purchaseTotalGreater );
                    put( "full_resp", fullResp );
                    put( "food_only", foodOnly );
                    put( "upc_only", upcOnly );
                    put( "receipts_only", receiptsOnly );
                    put( "upc_resolved_after", upcResolvedAfter );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5574222954656229092L;
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
        GetAllUserPurchasesWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetAllUserPurchasesWrapper>(){});

        return result;
    }
        
    /**
     * This endpoint is obsolete. Consider using "users/{user_id}/purchase_history/".   Get history of loyalty purchases made by a specified user from connected stores, must specify "user_id".
     * @param    userId    Required parameter: TODO: type description here
     * @param    storeId    Optional parameter: Check Lookup/Stores section for ID of all stores. E.g., Amazon = 4, Walmart = 3.
     * @param    page    Optional parameter: default:1
     * @param    perPage    Optional parameter: default:10, max:50
     * @param    foodOnly    Optional parameter: default:false [Filter out food purchase items.]
     * @param    upcOnly    Optional parameter: default:false [Filter out purchase items with UPC.]
     * @param    upcResolvedAfter    Optional parameter: List only purchases having UPC resolved by IM after specified date. Expected format: "yyyy-MM-dd".
     * @param    recordCreatedAfter    Optional parameter: List only purchases collected, i.e., database inserted by bots, after specified date. Not to be confused with purchase date (not existing for many loyalty purchases). Expected format: "yyyy-MM-dd"
	 * @return	Returns the GetAllUserLoyaltyPurchasesWrapper response from the API call*/
    public GetAllUserLoyaltyPurchasesWrapper userPurchasesGetAllUserLoyaltyPurchases(
            final String userId,
            final Integer storeId,
            final Integer page,
            final Integer perPage,
            final Boolean foodOnly,
            final Boolean upcOnly,
            final String upcResolvedAfter,
            final String recordCreatedAfter
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/loyalty_purchases");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4630854305931556570L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5516790379480881147L;
            {
                    put( "store_id", storeId );
                    put( "page", page );
                    put( "per_page", perPage );
                    put( "food_only", foodOnly );
                    put( "upc_only", upcOnly );
                    put( "upc_resolved_after", upcResolvedAfter );
                    put( "record_created_after", recordCreatedAfter );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4731786895516799200L;
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
        GetAllUserLoyaltyPurchasesWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetAllUserLoyaltyPurchasesWrapper>(){});

        return result;
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

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5304483843524201398L;
            {
                    put( "user_id", userId );
                    put( "purchase_id", purchaseId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5033939139524796836L;
            {
                    put( "full_resp", fullResp );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5332175535099358248L;
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
        GetSingleUserPurchaseWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetSingleUserPurchaseWrapper>(){});

        return result;
    }
        
}