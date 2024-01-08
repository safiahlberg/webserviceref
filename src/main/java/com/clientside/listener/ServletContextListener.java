package com.clientside.listener;

import com.clientside.SimpleWs;
import com.clientside.SimpleWsImplementationService;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.xml.ws.WebServiceRef;

@WebListener
public class ServletContextListener implements HttpSessionListener {

    public static final String SIMPLE_WS_IMPLEMENTATION_PORT = "simpleWsImplementationPort";
    @WebServiceRef(wsdlLocation = "/META-INF/wsdl/testwebservice.wsdl")
    private SimpleWsImplementationService simpleWsImplementationService;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSessionListener.super.sessionCreated(se);

        SimpleWs simpleWsImplementationPort = simpleWsImplementationService.getSimpleWsImplementationPort();

        se.getSession().setAttribute(SIMPLE_WS_IMPLEMENTATION_PORT, simpleWsImplementationPort);
    }
}
