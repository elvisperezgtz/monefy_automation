package com.yellowpepper.qa.steps_definitions;

import com.yellowpepper.qa.tasks.Login;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.thucydides.core.annotations.Managed;

public class SwagLabsSteps {
    @Managed(driver = "appium")
    private AppiumDriver driver;
    private Actor elvis = Actor.named("Elvis");

    @Before
    public void setUp() {
        Stage stage = OnStage.setTheStage(new OnlineCast());
        elvis.can(BrowseTheWeb.with(driver));
    }

    @Given("Elvis opens swag labs app")
    public void elvisOpensSwagLabsApp() {
      elvis.attemptsTo();
    }
    @When("he enters to the application with his credentials")
    public void heEntersToTheApplicationWithHisCredentials() {

        elvis.attemptsTo(
                Login.withHisCredentials("standard_user","secret_sauce")
        );
    }
    @Then("he should be able to see the welcome message")
    public void heShouldBeAbleToSeeTheWelcomeMessage() {

    }
}
