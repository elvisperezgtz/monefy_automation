package com.yellowpepper.qa.tasks;

import com.yellowpepper.qa.utils.CategoryIndex;
import com.yellowpepper.qa.interactions.Digit;
import com.yellowpepper.qa.models.Expense;
import com.yellowpepper.qa.user_interfaces.ExpenseUI;
import com.yellowpepper.qa.user_interfaces.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegisterExpenseBy implements Task {
    private List<Expense> expenses;

    public RegisterExpenseBy(List<Expense> expenses) {
        this.expenses = expenses;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Expense expense : expenses) {
            actor.attemptsTo(
                    Click.on(HomeUI.EXPENSES_CATEGORY.of(CategoryIndex.getCategoryIndex(expense.getCategory()))),
                    Enter.theValue(expense.getNote()).into(ExpenseUI.NOTE),
                    Digit.theValue(expense.getValue()),
                    Click.on(ExpenseUI.CHOSE_CATEGORY)
            );
        }
    }

    public static RegisterExpenseBy Category(List<Expense> expenses) {
        return Tasks.instrumented(RegisterExpenseBy.class, expenses);
    }
}
