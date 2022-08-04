package com.yellowpepper.qa.expenses;

import com.yellowpepper.qa.models.Expense;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

public class Calculate {
    public static String allExpenses(List<Expense> expenses){
        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder, Locale.US);
        double totalExpensesValue=0;

        for (Expense expense: expenses) {
            totalExpensesValue += Double.parseDouble(expense.getValue()) ;
        }

        formatter.format("-$%(,.2f",totalExpensesValue);
       return  (stringBuilder.toString());

    }


    public static void main(String[] args) {


        Expense expense1 = new Expense("3600", "Transporte", "Car");
        Expense expense2 = new Expense("180000", "Compras comida", "Food");
        Expense expense3 = new Expense("90000", "Cine", "Entertainment");
        List<Expense> expenses = new ArrayList<>();
        expenses.add(expense1);
        expenses.add(expense2);
        expenses.add(expense3);

        System.out.println(allExpenses(expenses));
    }
}
