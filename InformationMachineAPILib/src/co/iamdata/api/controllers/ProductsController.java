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

public class ProductsController extends BaseController {

    //private fields for configuration

   /** Id of your app */
    private String clientId;

   /** Secret key which authorizes you to use this API */
    private String clientSecret;

   /**
    * Constructor with authentication and configuration parameters */
    public ProductsController (String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public ProductsController (HttpClient _client, String clientId, String clientSecret) {
        super(_client);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * You can query the IM product database by either product name or UPC/EAN/ISBN identifier. Note: If both parameters are specified, UPC/EAN/ISBN has higher priority.
     * @param    name    Optional parameter: TODO: type description here
     * @param    id    Optional parameter: TODO: type description here
     * @param    page    Optional parameter: TODO: type description here
     * @param    perPage    Optional parameter: default:10, max:50
     * @param    fullResp    Optional parameter: default:false (set true for response with nutrients)
	 * @return	Returns the GetProductsWrapper response from the API call*/
    public GetProductsWrapper productsGetProducts(
            final String name,
            final String id,
            final Integer page,
            final Integer perPage,
            final Boolean fullResp
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products");

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4641688352921665457L;
            {
                    put( "name", name );
                    put( "id", id );
                    put( "page", page );
                    put( "per_page", perPage );
                    put( "full_resp", fullResp );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4747382726303605135L;
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
            throw new APIException("Not found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetProductsWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductsWrapper>(){});

        return result;
    }
        
    /**
     * Get details about a single product in the IM database by specifying a product ID.
     * @param    productId    Required parameter: TODO: type description here
     * @param    fullResp    Optional parameter: default:false (set true for response with nutrients)
	 * @return	Returns the GetProductWrapper response from the API call*/
    public GetProductWrapper productsGetProduct(
            final String productId,
            final Boolean fullResp
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products/{product_id}");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4818458575215002514L;
            {
                    put( "product_id", productId );
            }});

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5104516147643023420L;
            {
                    put( "full_resp", fullResp );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5481676876211220685L;
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
            throw new APIException("Not found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetProductWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductWrapper>(){});

        return result;
    }
        
    /**
     * Get alternatives for a specified product. Note: Must specify both product ID and ID for desired alternative type.
     * @param    productId    Required parameter: TODO: type description here
     * @param    alternativeTypeId    Required parameter: TODO: type description here
	 * @return	Returns the GetProductAlternativesWrapper response from the API call*/
    public GetProductAlternativesWrapper productsGetProductAlternatives(
            final String productId,
            final String alternativeTypeId
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products/{product_id}/alternatives/{alternative_type_id}");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4766986092113792847L;
            {
                    put( "product_id", productId );
                    put( "alternative_type_id", alternativeTypeId );
            }});

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5713775779228899341L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4746833288652712155L;
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
            throw new APIException("Not found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetProductAlternativesWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductAlternativesWrapper>(){});

        return result;
    }
        
    /**
     * Get all purchases a user has made for a product by specifying the associated product ID.
     * @param    productId    Required parameter: TODO: type description here
     * @param    page    Optional parameter: TODO: type description here
     * @param    perPage    Optional parameter: default:10, max:50
	 * @return	Returns the GetProductPurchasesWrapper response from the API call*/
    public GetProductPurchasesWrapper productsGetProductPurchases(
            final String productId,
            final Integer page,
            final Integer perPage
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products/{product_id}/purchases");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4896535674188207553L;
            {
                    put( "product_id", productId );
            }});

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5181061432838837655L;
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
            private static final long serialVersionUID = 4632109344483392616L;
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
            throw new APIException("Not found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetProductPurchasesWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductPurchasesWrapper>(){});

        return result;
    }
        
    /**
     * Get prices (from available stores) for specified product IDs. Note: It is possible to query 20 product IDs per each request. Please separate IDs with commas (e.g.: “325365, 89300”).
     * @param    productIds    Optional parameter: TODO: type description here
	 * @return	Returns the GetProductPricesWrapper response from the API call*/
    public GetProductPricesWrapper productsGetProductPrices(
            final String productIds
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products_prices");

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4854699251595310334L;
            {
                    put( "product_ids", productIds );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5399205949500307957L;
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
            throw new APIException("Not found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetProductPricesWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductPricesWrapper>(){});

        return result;
    }
        
    /**
     * Get product alternatives for a specified alternative type (e.g.: “type_id: 7” will display alternatives of the “general” type) for a list of products specified by product IDs. Note: See “Lookup” section, “product_alternative_type” for list of all possible alternative types.
     * @param    productIds    Optional parameter: TODO: type description here
     * @param    typeId    Optional parameter: TODO: type description here
	 * @return	Returns the GetProductsAlternativesWrapper response from the API call*/
    public GetProductsAlternativesWrapper productsGetProductsAlternatives(
            final String productIds,
            final String typeId
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products_alternatives");

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5285663714610580451L;
            {
                    put( "product_ids", productIds );
                    put( "type_id", typeId );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5226722055812803737L;
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

        else if (responseCode == 404)
            throw new APIException("Not found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetProductsAlternativesWrapper result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductsAlternativesWrapper>(){});

        return result;
    }
        
    /**
     * Get full history of products purchased by a specified user at connected stores, must define “user_id".
     * @param    userId    Required parameter: TODO: type description here
     * @param    page    Optional parameter: TODO: type description here
     * @param    perPage    Optional parameter: default:10, max:50
     * @param    fullResp    Optional parameter: default:false (set true for response with nutrients)
     * @param    foodOnly    Optional parameter: default:false (set true to list food products only)
	 * @return	Returns the GetUserProducts response from the API call*/
    public GetUserProducts productsGetUserProducts(
            final String userId,
            final Integer page,
            final Integer perPage,
            final Boolean fullResp,
            final Boolean foodOnly
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/users/{user_id}/products");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5369716492793094734L;
            {
                    put( "user_id", userId );
            }});

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4761958464436979731L;
            {
                    put( "page", page );
                    put( "per_page", perPage );
                    put( "full_resp", fullResp );
                    put( "food_only", foodOnly );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4851922584998896698L;
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
            throw new APIException("Not found", 404, response.getRawBody());

        else if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetUserProducts result = APIHelper.jsonDeserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetUserProducts>(){});

        return result;
    }
        
}