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
     * @param    name    Optional parameter: Product name (or part)
     * @param    productIdentifier    Optional parameter: UPC/EAN/ISBN
     * @param    page    Optional parameter: TODO: type description here
     * @param    perPage    Optional parameter: default:10, max:50
     * @param    requestData    Optional parameter: Additional request data sent by IM API customer. Expected format:"Key1:Value1;Key2:Value2"
     * @param    fullResp    Optional parameter: default:false (set true for response with nutrients)
	 * @return	Returns the GetProductsWrapper response from the API call*/
    public GetProductsWrapper productsSearchProducts(
            final String name,
            final String productIdentifier,
            final Integer page,
            final Integer perPage,
            final String requestData,
            final Boolean fullResp
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5110123356654213201L;
            {
                    put( "name", name );
                    put( "product_identifier", productIdentifier );
                    put( "page", page );
                    put( "per_page", perPage );
                    put( "request_data", requestData );
                    put( "full_resp", fullResp );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5347297177510290398L;
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
        GetProductsWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductsWrapper>(){});

        return result;
    }
        
    /**
     * Get details about a single product in the IM database by specifying a Information Machine Product ID.
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

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4959448257319652796L;
            {
                    put( "product_id", productId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5573271137624629270L;
            {
                    put( "full_resp", fullResp );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4840105236451837746L;
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
        GetProductWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductWrapper>(){});

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

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5622309655448009993L;
            {
                    put( "product_id", productId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5639406569362787034L;
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
            private static final long serialVersionUID = 5315743090767428237L;
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
        GetProductPurchasesWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductPurchasesWrapper>(){});

        return result;
    }
        
    /**
     * Get prices (from available stores) for specified product IDs. Note: It is possible to query 20 product IDs per each request. Please separate IDs with commas (e.g.: "325365, 89300").
     * @param    productIds    Required parameter: TODO: type description here
	 * @return	Returns the GetProductPricesWrapper response from the API call*/
    public GetProductPricesWrapper productsGetProductPrices(
            final String productIds
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products_prices");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5238679982564551265L;
            {
                    put( "product_ids", productIds );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5534605503758809855L;
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
        GetProductPricesWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductPricesWrapper>(){});

        return result;
    }
        
    /**
     * Get product alternatives for a specified alternative type (e.g.: "type_id: 7" will display alternatives of the "general" type) for a list of products specified by product IDs. Note: See "Lookup" section, "product_alternative_type" for list of all possible alternative types. List of product ids must not contain more than 20 ids or else Bad Request will be returned.
     * @param    productIds    Required parameter: TODO: type description here
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

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5324411952518747212L;
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
            private static final long serialVersionUID = 5345161018274828378L;
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
        GetProductsAlternativesWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetProductsAlternativesWrapper>(){});

        return result;
    }
        
    /**
     * Get full history of products purchased by a specified user at connected stores, must define "user_id".
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

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5641492998033473054L;
            {
                    put( "user_id", userId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5204830888678411953L;
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
            private static final long serialVersionUID = 5460869066474141349L;
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
        GetUserProducts result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetUserProducts>(){});

        return result;
    }
        
    /**
     * Request POST model is simple list of strings. Each list item can be submitted in two variations: name only OR name+store [use semicolon ';' as name and store separator].Use "result" property in response, received after successful request submission, to list resolving results (endpoint below... GET v1/products/upc_resolve_response/{request_id}). Webhook JSON model example: { "name":"UB RDY RICE WHL BROWN", "store":"", "resolve_status":"Finished", "upcs":"123456789012,123456789012" }
     * @param    payload    Required parameter: TODO: type description here
     * @param    webhookUrl    Optional parameter: URL we'll use to ping you as soon as product name is resolved to UPC. Please find POST body above.
	 * @return	Returns the GetUPCsByNameRequestWrapper response from the API call*/
    public GetUPCsByNameRequestWrapper productsSubmitProductNamesForUpcResolve(
            final NameResolveRequest payload,
            final String webhookUrl
    ) throws IOException, APIException, JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products/upc_resolve_request");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5265890781876160331L;
            {
                    put( "webhook_url", webhookUrl );
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4759288500912366921L;
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
        if (responseCode == 401)
            throw new APIException("Unauthorized", 401, response.getRawBody());

        else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetUPCsByNameRequestWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetUPCsByNameRequestWrapper>(){});

        return result;
    }
        
    /**
     * Use request ID recevied in "v1/products/upc_resolve_request/" [request initiate].Response model has four properties: "name" - product name submitted for UPC resolve"store" - store submitted (in combination with name)"resolve_status" - "Queued" or "Finished""upcs" - list of UPCs that correspond to submitted name or name+store request
     * @param    requestId    Required parameter: TODO: type description here
	 * @return	Returns the GetUPCsByNameResponseWrapper response from the API call*/
    public GetUPCsByNameResponseWrapper productsGetUPCByProductNameAnswer(
            final String requestId
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/v1/products/upc_resolve_response/{request_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5295344767268234963L;
            {
                    put( "request_id", requestId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5299397772401768281L;
            {
                    put( "client_id", clientId );
                    put( "client_secret", clientSecret );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5466361722712504091L;
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
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        GetUPCsByNameResponseWrapper result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GetUPCsByNameResponseWrapper>(){});

        return result;
    }
        
}