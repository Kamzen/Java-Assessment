package com.eviro.assessment.grad0001.thembamakamu;

import javax.security.auth.login.AccountNotFoundException;

public class AccNotFound extends AccountNotFoundException {

    public AccNotFound() {
    }

    public AccNotFound(String msg) {
        super(msg);

    }

    @Override
    public String getMessage() {

        return super.getMessage();
    }

}
