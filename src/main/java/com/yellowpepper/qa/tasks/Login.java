package com.yellowpepper.qa.tasks;

import com.yellowpepper.qa.user_interfaces.LoginUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login {
    public static Performable withHisCredentials(String username, String password) {
        return Task.where("{0} enters to the app with his credentials",
                Enter.theValue(username).into(LoginUI.USERNAME),
                Enter.theValue(password).into(LoginUI.PASSWORD),
                Click.on(LoginUI.LOGGIN)
        );
    }
}
