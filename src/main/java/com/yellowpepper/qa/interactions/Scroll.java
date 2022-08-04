package com.yellowpepper.qa.interactions;

import com.google.common.collect.ImmutableMap;
import com.yellowpepper.qa.user_interfaces.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Evaluate;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Scroll implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        TouchActions action = new TouchActions(BrowseTheWeb.as(actor).getDriver());
        action.scroll(HomeUI.BALANCE.resolveFor(actor), 50, 100);
        action.perform();

    }

    public static Scroll downToTarget() {
        return Tasks.instrumented(Scroll.class);
    }
}
