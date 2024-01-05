package com.clientside.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    private TestText testText;

    @Override
    public String execute() {
        testText = new TestText();

        testText.setMesage(String.format("Test Action%n"));

        return SUCCESS;
    }

    public TestText getTestText() {
        return testText;
    }
}
