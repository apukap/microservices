package com.tcs.hackathon.lms.ui.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class LMSAdminView extends VerticalLayout implements View {

    public static final String NAME="LMSAdminView";

    private Button userButton=new Button("User Button");
    private Button googleBooksButton=new Button("Google Books Button");

    public LMSAdminView()
    {
        TabSheet tabsheet = new TabSheet();
        this.addComponent(tabsheet);

        VerticalLayout tabno1 = new VerticalLayout();
        tabno1.addComponent(userButton);
        tabsheet.addTab(tabno1);

        VerticalLayout tabno2 = new VerticalLayout();
        tabno2.addComponent(googleBooksButton);
        tabsheet.addTab(tabno2);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
