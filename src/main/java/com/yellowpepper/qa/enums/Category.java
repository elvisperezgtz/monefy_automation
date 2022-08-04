package com.yellowpepper.qa.enums;

public enum Category {
    FOOD("1"),
    HOUSE("2"),
    EATING_OUT("3"),
    TOILETRY("4"),
    CAR("5"),
    TRANSPORT("6"),
    SPORT("7"),
    HEALTH("8"),
    ENTERTAINMENT("9"),
    TAXI("10"),
    CLOTHES("11"),
    COMMUNICATIONS("12"),
    ;

    private final String categoryNumber;

    Category(String categoryNumber) {
        this.categoryNumber = categoryNumber;
    }
    public String categoryNumber(){
        return categoryNumber;
    }
}
