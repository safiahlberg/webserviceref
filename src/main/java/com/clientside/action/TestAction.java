package com.clientside.action;

import com.clientside.SimpleWs;
import com.clientside.SimpleWsImplementationService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.action.ApplicationAware;

import java.util.Map;

public class TestAction extends ActionSupport implements ApplicationAware {

    private TestText testText;

    private Map<String, Object> application;

    private SimpleWsImplementationService simpleWsImplementationService;

    @Override
    public String execute() {
        testText = new TestText();

        SimpleWs port = simpleWsImplementationService.getSimpleWsImplementationPort();

        String serviceResponse = port.simpleOperation();

        testText.setMessage(String.format("TestAction.execute%n%s%n", serviceResponse));

        return SUCCESS;
    }

    public TestText getTestText() {
        return testText;
    }

    @Override
    public void withApplication(Map<String, Object> application) {
        this.application = application;

        this.simpleWsImplementationService = (SimpleWsImplementationService) this.application.get("simpleWsImplementationService");
    }
}
