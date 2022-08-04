package com.yellowpepper.qa.models;

public class Expense {
    private String value;
    private String note;
    private String category;

    public Expense(String value, String note, String category) {
        this.value = value;
        this.note = note;
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public String getNote() {
        return note;
    }

    public String getCategory() {
        return category;
    }
}
