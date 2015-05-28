/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.controllers;

import co.iamdata.api.http.client.HttpClient;
import co.iamdata.api.http.client.UnirestClient;

public abstract class BaseController {
    /**
     * Protected variable to keep reference of client instance
     */
    protected HttpClient clientInstance = null;

    /**
     * Initialize with the default http client
     */
    public BaseController() {
        clientInstance = UnirestClient.getSharedInstance();
    }

    /**
     * Initialize the base controller using the given http client
     *
     * @param _client The given http client
     */
    public BaseController(HttpClient _client) {
        clientInstance = _client;
    }
}
