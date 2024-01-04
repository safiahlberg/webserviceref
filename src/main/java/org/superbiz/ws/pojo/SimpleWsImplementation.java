package org.superbiz.ws.pojo;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.transaction.UserTransaction;
import javax.xml.ws.WebServiceContext;

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