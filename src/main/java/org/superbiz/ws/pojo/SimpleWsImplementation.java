package org.superbiz.ws.pojo;

import jakarta.annotation.Resource;
import jakarta.jws.WebService;
import jakarta.transaction.UserTransaction;
import jakarta.xml.ws.WebServiceContext;

@WebService(endpointInterface = "org.superbiz.ws.pojo.SimpleWs")
public class SimpleWsImplementation implements SimpleWs {

    @Resource
    private WebServiceContext webServiceContext;

    @Resource
    private UserTransaction userTransaction;

    @Override
    public String simpleOperation() {
        return webServiceContext + " & " + userTransaction;
    }

    public void setWebServiceContext(WebServiceContext webServiceContext) {
        this.webServiceContext = webServiceContext;
    }

    public void setUserTransaction(UserTransaction userTransaction) {
        this.userTransaction = userTransaction;
    }
}