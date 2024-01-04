package org.superbiz.ws.pojo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SimpleWs {

    @WebMethod
    String simpleOperation();
}