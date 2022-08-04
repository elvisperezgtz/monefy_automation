package com.yellowpepper.qa.utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidMobileCommandHelper;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;

import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Commands {
    public static void scroll(AppiumDriver driver){
        TouchActions action = new TouchActions(driver);
//        action.scroll(element, 10, 100);
//        action.perform();


    }


    public static void executeShellCommand(WebDriver fecade) throws InterruptedException {
        WebDriver driver = ((WebDriverFacade) fecade).getProxiedDriver();

        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",   ImmutableMap.of(
                "left", 100, "top", 100, "width", 200, "height", 200,
                "direction", "down",
                "percent", 3.0
        ));

        Thread.sleep(3000);
    }


}
