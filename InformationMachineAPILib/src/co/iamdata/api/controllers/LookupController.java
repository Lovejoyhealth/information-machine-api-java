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

public class LookupController extends BaseController {

    //private fields for configuration

   /** Id of your app */
    private String clientId;

   /** Secret key which authorizes you to use this API */
    private String clientSecret;

   /**
    * Constructor with authentication and configuration parameters */
    public LookupController (String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public LookupController (HttpClient _client, String clientId, String clientSecret) {
        super(_client);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Get a list of all possible categories available for alternative product recommendations.
	 * @return	Returns the GetProductAlternativeTypesWrapper response from the API call*/
    public GetProductAlternativeTypesWrapper lookupGetProductAlternativeTypes(
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/product_alternative_types");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5422421725826361752L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5153038013198775603L;
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
        GetProductAlternativeTypesWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductAlternativeTypesWrapper>(){});

        return result;
    }
        
    /**
     * Get a list of the units of measurement that could be associated with a product's nutrition facts.
	 * @return	Returns the GetUOMsWrapper response from the API call*/
    public GetUOMsWrapper lookupGetUOMs(
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/units_of_measurement");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4764960433757491082L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4651403980406328630L;
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
        GetUOMsWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetUOMsWrapper>(){});

        return result;
    }
        
    /**
     * Get a list of all potential product categories.  Product categories follow a hierarchical structure that is defined through the "parent_id" field.
	 * @return	Returns the GetCategoriesWrapper response from the API call*/
    public GetCategoriesWrapper lookupGetCategories(
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/categories");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5182197411563401240L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5268287252582279821L;
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
        GetCategoriesWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetCategoriesWrapper>(){});

        return result;
    }
        
    /**
     * Get a list of all the nutrients that are available on a product's nutrition label.
	 * @return	Returns the GetNutrientsWrapper response from the API call*/
    public GetNutrientsWrapper lookupGetNutrients(
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/nutrients");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5068580052973678221L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5632224572862217270L;
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
        GetNutrientsWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetNutrientsWrapper>(){});

        return result;
    }
        
    /**
     * Get a list of all stores in the IM API infrastructure. This list is constantly expanding. For stores that have "can_scrape" flag set to "1", you can use the IM infrastructure to retrieve purchase history. To do this, connect the store using the endpoints under the "Users" section below.
	 * @return	Returns the GetStoresWrapper response from the API call*/
    public GetStoresWrapper lookupGetStores(
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/stores");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5245384351749902106L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4960071987248777053L;
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
        GetStoresWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetStoresWrapper>(){});

        return result;
    }
        
    /**
     * Get a list of all tags available through the IM infrastructure.
	 * @return	Returns the GetTagsWrapper response from the API call*/
    public GetTagsWrapper lookupGetTags(
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/tags");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5479648833775039392L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5328436689443730154L;
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
        GetTagsWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetTagsWrapper>(){});

        return result;
    }
        
}