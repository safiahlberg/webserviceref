package com.example.myservice;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.xml.ws.WebServiceRef;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ts")
public class TestServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "http://localhost:8080/webserviceref/PojoWSService?wsdl")
    private PojoWSService pojoWSService;

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        try (PrintWriter out = response.getWriter()) {

            WS pojoWSPort = pojoWSService.getPojoWSPort();

            String message = pojoWSPort.ws();

            out.println(String.format("Hello World!%nMessage from web service: %s", message));
        }
    }
}
