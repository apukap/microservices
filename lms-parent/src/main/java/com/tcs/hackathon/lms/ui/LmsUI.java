package com.tcs.hackathon.lms.ui;

import com.tcs.hackathon.lms.ui.form.LoginForm;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = "/")
public class LmsUI extends UI {

    private Label header=new Label("Book Management System");

    private VerticalLayout verticalLayout=new VerticalLayout();
    private LoginForm loginForm=new LoginForm(this);

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        verticalLayout.addComponent(header);
        verticalLayout.addComponent(loginForm);
        setContent(verticalLayout);
    }
}
