package com.clientside.action;

import com.clientside.SimpleWs;
import com.clientside.SimpleWsImplementationService;
import com.clientside.listener.ServletContextListener;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.action.SessionAware;

import java.util.Map;

public class TestAction extends ActionSupport implements SessionAware {

    private TestText testText;

    private Map<String, Object> session;

    private SimpleWs simpleWsImplementationPort;

    @Override
    public String execute() {
        testText = new TestText();

        String serviceResponse = simpleWsImplementationPort.simpleOperation();

        testText.setMessage(String.format("TestAction.execute%n%s%n", serviceResponse));

        return SUCCESS;
    }

    public TestText getTestText() {
        return testText;
    }

    @Override
    public void withSession(Map<String, Object> session) {

        this.session = session;

        this.simpleWsImplementationPort =
                (SimpleWs) this.session.get(ServletContextListener.SIMPLE_WS_IMPLEMENTATION_PORT);
    }

}
