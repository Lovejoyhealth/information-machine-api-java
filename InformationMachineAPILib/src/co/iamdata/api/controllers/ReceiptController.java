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

public class ReceiptController extends BaseController {

    //private fields for configuration

   /** Id of your app */
    private String clientId;

   /** Secret key which authorizes you to use this API */
    private String clientSecret;

   /**
    * Constructor with authentication and configuration parameters */
    public ReceiptController (String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public ReceiptController (HttpClient _client, String clientId, String clientSecret) {
        super(_client);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Upload a receipt with unique ID (“receipt_id”) and associate it to a specified user using “user_id” parameter. Note: Uploaded receipt image should be Base 64 encoded. For testing purposes you can find our Base 64 encoded logo here: http://api.iamdata.co/images/base64/encoded_logo.txt
     * @param    payload    Required parameter: TODO: type description here
     * @param    userId    Required parameter: TODO: type description here
	 * @return	Returns the UploadReceiptWrapper response from the API call*/
    public UploadReceiptWrapper receiptUploadReceipt(
            final UploadReceiptRequest payload,
            final String userId
    ) throws IOException, APIException, JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/receipt");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5496140011811692987L;
            {
                    put( "user_id", userId );
            }});

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5366096201681723422L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5447867134530294073L;
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

        else if (responseCode == 500)
            throw new APIException("Internal Server Error", 500, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        UploadReceiptWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<UploadReceiptWrapper>(){});

        return result;
    }
        
}