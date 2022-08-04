package com.yellowpepper.qa.user_interfaces;

//import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final String PATH = "com.monefy.app.pro:";
    public static final Target OPTIONS_MENU = Target
            .the("Option menu")
            .locatedForAndroid(By.id(PATH.concat("id/overflow")))
            .locatedForIOS(org.openqa.selenium.By.id(""));

    public static final Target SETTINGS = Target
            .the("Option settings")
            .locatedForAndroid(By.id(PATH.concat("id/settings_textview")))
            .locatedForIOS(org.openqa.selenium.By.id(""));

    public static final Target EXPENSE = Target
            .the("expense button")
            .locatedForAndroid(By.id(PATH.concat("id/expense_button")))
            .locatedForIOS(org.openqa.selenium.By.id(""));

    public static final Target BALANCE = Target
            .the("Balance")
            .locatedForAndroid(By.id(PATH.concat("id/balance_amount")))
            .locatedForIOS(org.openqa.selenium.By.id(""));

    public static final Target EXPENSES_CATEGORY = Target
            .the("Expenses category {0}")
            .locatedBy("(//android.widget.FrameLayout[@resource-id='com.monefy.app.pro:id/piegraph']/android.widget.ImageView)[{0}]");

}
