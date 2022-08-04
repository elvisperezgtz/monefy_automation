package com.yellowpepper.qa.steps_definitions;

import com.yellowpepper.qa.interactions.Scroll;
import com.yellowpepper.qa.models.Expense;
import com.yellowpepper.qa.tasks.Register;
import com.yellowpepper.qa.tasks.RegisterExpenseBy;
import com.yellowpepper.qa.user_interfaces.HomeUI;
import com.yellowpepper.qa.expenses.Calculate;
import com.yellowpepper.qa.utils.Commands;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExpensesSteps {


    @Managed(driver = "appium")
    private AppiumDriver driver;
    private Actor elvis = Actor.named("Elvis");
    List<Expense> expenses = new ArrayList<>();

    @Before
    public void setUp() {
        Stage stage = OnStage.setTheStage(new OnlineCast());
        elvis.can(BrowseTheWeb.with(driver));
    }


    @Given("the user has access to the app")
    public void theUserHasAccessToTheApp() {
        elvis.attemptsTo();
        Expense expense1 = new Expense("3600", "Transporte", "Car");
        Expense expense2 = new Expense("180000", "Compras comida", "Food");
        Expense expense3 = new Expense("90000", "Cine", "Entertainment");

        expenses.add(expense1);
        expenses.add(expense2);
        expenses.add(expense3);

    }

    @When("the user registers new expenses")
    public void theUserRegistersNewExpenses() {
        elvis.attemptsTo(
                Register.newExpenses(expenses)
        );
    }

    @Then("the user should be able to see that the expenses are the expected")
    public void theUserShouldBeAbleToSeeThatTheExpensesAreTheExpected() {

    }

    @Then("the user should be able to see that the expense percentages add up to {int} percent")
    public void theUserShouldBeAbleToSeeThatTheExpensePercentagesAddUpToPercent(Integer int1) {

    }

    @When("the user selects a category to register a new expense")
    public void theUserSelectsACategoryToRegisterANewExpense() {

        elvis.attemptsTo(
                RegisterExpenseBy.Category(expenses)
        );
    }

    @Then("the user should be able to see that the balance is negative and the expected")
    public void theUserShouldBeAbleToSeeThatTheBalanceIsNegativeAndTheExpected() {

    }

    @Then("the user should be able to see that the percent is {int} percent in the category selected")
    public void theUserShouldBeAbleToSeeThatThePercentIsPercentInTheCategorySelected(Integer int1) {

    }

    @Then("the user should be able to see that the balance is the expected")
    public void theUserShouldBeAbleToSeeThatTheBalanceIsTheExpected() {

        elvis.attemptsTo(
                Ensure.that(HomeUI.BALANCE).hasText(String.format("Balance %s", Calculate.allExpenses(expenses)))
        );
    }



    @When("I perform a scroll")
    public void iPerformAScroll() throws InterruptedException {

            elvis.attemptsTo(
                    Click.on(HomeUI.OPTIONS_MENU),
                    Click.on(HomeUI.SETTINGS.waitingForNoMoreThan(Duration.ofSeconds(12)))

            );
        Commands.executeShellCommand(BrowseTheWeb.as(elvis).getDriver());

    }
}
