package com.yellowpepper.qa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static Target USERNAME = Target.the("Username field")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"))
            .locatedForIOS(By.xpath("//XCUIElementTypeTextField[@name=\"test-Username\"]"));

    public static Target PASSWORD = Target.the("password field")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"))
            .locatedForIOS(By.xpath("//XCUIElementTypeSecureTextField[@name='test-Password']"));

    public static Target LOGGIN = Target.the("login button")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"))
            .locatedForIOS(By.xpath("//XCUIElementTypeOther[@name=\"test-LOGIN\"]"));

}
