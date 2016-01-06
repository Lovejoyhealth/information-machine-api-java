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

public class UserScansController extends BaseController {

    //private fields for configuration

   /** Id of your app */
    private String clientId;

   /** Secret key which authorizes you to use this API */
    private String clientSecret;

   /**
    * Constructor with authentication and configuration parameters */
    public UserScansController (String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public UserScansController (HttpClient _client, String clientId, String clientSecret) {
        super(_client);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Upload a receipt with unique ID ("receipt_id") and associate it to a specified user using "user_id" parameter. Note: Uploaded receipt image should be Base 64 encoded. For testing purposes you can find our Base 64 encoded logo here: http://api.iamdata.co/images/base64/encoded_logo.txt
     * @param    payload    Required parameter: TODO: type description here
     * @param    userId    Required parameter: TODO: type description here
	 * @return	Returns the UploadReceiptWrapper response from the API call*/
    public UploadReceiptWrapper userScansUploadReceipt(
            final UploadReceiptRequest payload,
            final String userId
    ) throws IOException, APIException, JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/receipt");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5289530887433323191L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4894426314733386257L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4794379659443929678L;
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

        else if (responseCode == 500)
            throw new APIException("Internal Server Error", 500, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        UploadReceiptWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<UploadReceiptWrapper>(){});

        return result;
    }
        
    /**
     * Receipt statuses: Unknown, Uploaded, Processing, Done, Unreadable, Duplicate, StoreMissing.
     * @param    userId    Required parameter: TODO: type description here
     * @param    receiptId    Required parameter: TODO: type description here
	 * @return	Returns the UploadReceiptStatusWrapper response from the API call*/
    public UploadReceiptStatusWrapper userScansGetReceiptStatus(
            final String userId,
            final String receiptId
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/receipt/{receipt_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5048821076881965536L;
            {
                    put( "user_id", userId );
                    put( "receipt_id", receiptId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5344160240225689359L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5198538929794011266L;
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

        else if (responseCode == 500)
            throw new APIException("Internal Server Error", 500, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        UploadReceiptStatusWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<UploadReceiptStatusWrapper>(){});

        return result;
    }
        
    /**
     * Upload a new product by barcode and associate it to a specified user.  Note: Execution might take up to 15 seconds, depending on whether barcode exists in database or IM service must gather data around uploaded barcode.  POST payload example: { "bar_code" : "021130126026", "bar_code_type" : "UPC-A" }
     * @param    payload    Required parameter: TODO: type description here
     * @param    userId    Required parameter: ID of user in your system
	 * @return	Returns the UploadBarcodeWrapper response from the API call*/
    public UploadBarcodeWrapper userScansUploadBarcode(
            final UploadBarcodeRequest payload,
            final String userId
    ) throws IOException, APIException, JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/barcode");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4970028624632946569L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5136921418491838996L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4709911147905440534L;
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

        else if (responseCode == 500)
            throw new APIException("Internal Server Error", 500, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        UploadBarcodeWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<UploadBarcodeWrapper>(){});

        return result;
    }
        
}