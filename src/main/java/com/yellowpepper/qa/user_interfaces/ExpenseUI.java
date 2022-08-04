package com.yellowpepper.qa.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ExpenseUI {
    public static final String PATH = "com.monefy.app.pro:";

    public static final Target NUMBER = Target
            .the("key {0}")
            .locatedBy("//android.widget.Button[@resource-id='com.monefy.app.pro:id/buttonKeyboard{0}']");
    public static final Target NOTE = Target
            .the("Note fiel")
            .locatedForAndroid(By.id(PATH.concat("id/textViewNote")))
            .locatedForIOS(By.id(""))
            ;

    public static final Target CATEGORY = Target
            .the("Category")
            .located(By.id(PATH.concat("id/textViewChooseCategory")));

    public static final Target CATEGORY_NAME = Target
            .the("Category {0}")
            .locatedBy("//android.widget.TextView[@text='{0}']");

    public static final Target CHOSE_CATEGORY = Target
            .the("Chose category button")
            .locatedForAndroid(By.id(PATH.concat("id/textViewChooseCategory"))).locatedForIOS(By.id(""));

}
