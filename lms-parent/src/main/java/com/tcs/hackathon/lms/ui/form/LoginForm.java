package com.tcs.hackathon.lms.ui.form;

import com.tcs.hackathon.lms.ui.view.LMSAdminView;
import com.tcs.hackathon.lms.ui.LmsUI;

public class LoginForm extends com.vaadin.ui.LoginForm/*FormLayout*/ {

    private LmsUI lmsUI;

    public LoginForm(final LmsUI lmsUI)
    {
        this.lmsUI=lmsUI;
    }


}
