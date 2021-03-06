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
import io.swagger.client.model.ContactFull;
import io.swagger.client.model.CreateContactParams;
import io.swagger.client.model.DeleteContact;
import io.swagger.client.model.ListContactsFull;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Ignore
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * Add a new address book contact for an extension
     *
     * For more on the input fields, see Account Contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountExtensionContactTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        CreateContactParams data = null;
        ContactFull response = api.createAccountExtensionContact(accountId, extensionId, data);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountExtensionContactTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        Integer contactId = null;
        DeleteContact response = api.deleteAccountExtensionContact(accountId, extensionId, contactId);

        // TODO: test validations
    }
    
    /**
     * Retrieve the details of an address book contact
     *
     * For more info on the fields shown, see Account Contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountExtensionContactTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        Integer contactId = null;
        ContactFull response = api.getAccountExtensionContact(accountId, extensionId, contactId);

        // TODO: test validations
    }
    
    /**
     * Show a list of address book contacts
     *
     * See Account Contacts for more info on the fields in each item.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountExtensionContactsTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        List<String> filtersId = null;
        List<String> filtersGroupId = null;
        List<String> filtersUpdatedAt = null;
        String sortId = null;
        String sortUpdatedAt = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        ListContactsFull response = api.listAccountExtensionContacts(accountId, extensionId, filtersId, filtersGroupId, filtersUpdatedAt, sortId, sortUpdatedAt, limit, offset, fields);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * For more on the input fields, see Account Contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAccountExtensionContactTest() throws ApiException {
        Integer accountId = 1315091;
        Integer extensionId = 1764590;
        CreateContactParams data = null;
        ContactFull response = api.replaceAccountExtensionContact(accountId, extensionId, data);

        // TODO: test validations
    }
    
}
