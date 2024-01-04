package com.example.myservice;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ts")
public class TestServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "http://localhost:8080/webserviceref/SimpleWsImplementationService?wsdl")
    private SimpleWsImplementationService service;

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        try (PrintWriter out = response.getWriter()) {

            SimpleWs port = service.getSimpleWsImplementationPort();

            String message = port.simpleOperation();

            out.println(String.format("Hello World!%nTest Servlet%nMessage from web service: %s%n", message));
        }
    }
}
