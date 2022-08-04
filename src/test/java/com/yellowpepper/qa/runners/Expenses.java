package com.yellowpepper.qa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.yellowpepper.qa.steps_definitions",
        snippets = CAMELCASE,
        features = "src/test/resources/features/expense/expenses.feature",
        tags = "")
public class Expenses {
}
