package com.yellowpepper.qa.interactions;

import com.yellowpepper.qa.user_interfaces.ExpenseUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Digit implements Interaction {
    private String value;

    public Digit(String value) {
        this.value = value;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 0; i < value.length(); i++) {
            actor.attemptsTo(Click.on(ExpenseUI.NUMBER.of(String.valueOf(value.charAt(i)))));
        }

    }

    public static Digit theValue(String value) {
        return Tasks.instrumented(Digit.class, value);
    }
}
