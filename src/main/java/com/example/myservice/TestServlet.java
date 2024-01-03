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

    @WebServiceRef(PojoWSService.class)

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        try (PrintWriter out = response.getWriter()) {

            out.println("Hello World!");
        }
    }
}
