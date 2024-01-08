package com.clientside.listener;

import com.clientside.SimpleWsImplementationService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.WebServiceRef;

@WebListener
public class ApplicationContextListener implements ServletContextListener {


    @WebServiceRef(wsdlLocation = "/META-INF/wsdl/testwebservice.wsdl")
    private SimpleWsImplementationService simpleWsImplementationService;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);

        sce.getServletContext().setAttribute("simpleWsImplementationService", simpleWsImplementationService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
