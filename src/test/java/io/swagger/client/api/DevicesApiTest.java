/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreateDeviceParams;
import io.swagger.client.model.DeviceFull;
import io.swagger.client.model.ListDevicesFull;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesApi
 */
@Ignore
public class DevicesApiTest {

    private final DevicesApi api = new DevicesApi();

    
    /**
     * Register a generic VoIP device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountDeviceTest() throws ApiException {
        Integer accountId = 1315091;
        CreateDeviceParams data = null;
        DeviceFull response = api.createAccountDevice(accountId, data);

        // TODO: test validations
    }
    
    /**
     * Show details of an individual VoIP device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountDeviceTest() throws ApiException {
        Integer accountId = 1315091;
        Integer deviceId = 142315;
        DeviceFull response = api.getAccountDevice(accountId, deviceId);

        // TODO: test validations
    }
    
    /**
     * Get a list of VoIP devices associated with your account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountDevicesTest() throws ApiException {
        Integer accountId = 1315091;
        List<String> filtersId = null;
        List<String> filtersName = null;
        String sortId = null;
        String sortName = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        ListDevicesFull response = api.listAccountDevices(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);

        // TODO: test validations
    }
    
    /**
     * Update the settings for an individual VoIP device
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAccountDeviceTest() throws ApiException {
        Integer accountId = 1315091;
        Integer deviceId = 142315;
        CreateDeviceParams data = null;
        DeviceFull response = api.replaceAccountDevice(accountId, deviceId, data);

        // TODO: test validations
    }
    
}
