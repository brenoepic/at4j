package tech.brenoepic.at4j.core.exceptions;

import tech.brenoepic.at4j.util.rest.RestRequestInformation;
import tech.brenoepic.at4j.util.rest.RestRequestResponseInformation;

public class MethodNotAllowedException extends AzureException {

    /**
     * Creates a new instance of this class.
     *
     * @param origin The origin of the exception.
     * @param message The message of the exception.
     * @param request The information about the request.
     * @param response The information about the response.
     */
    public MethodNotAllowedException(Exception origin, String message, RestRequestInformation request,
                                     RestRequestResponseInformation response) {
        super(origin, message, request, response);
    }

}