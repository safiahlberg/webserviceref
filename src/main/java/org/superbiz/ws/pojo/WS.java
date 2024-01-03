package org.superbiz.ws.pojo;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface WS {

    @WebMethod
    String ws();
}