package com.clientside.action;

import com.clientside.SimpleWs;
import com.clientside.listener.ServletContextListener;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.action.SessionAware;

import java.util.Map;

public class SessionAction extends ActionSupport {

    @Override
    public String execute() {
               return SUCCESS;
    }


}
