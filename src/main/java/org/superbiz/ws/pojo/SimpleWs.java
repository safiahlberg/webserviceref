package org.superbiz.ws.pojo;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface SimpleWs {

    @WebMethod
    String simpleOperation();
}