package com.yellowpepper.qa.utils;

import java.util.Locale;

public class CategoryIndex {
    public static String getCategoryIndex(String categoryName) {

        String number = null;
        switch (categoryName.toUpperCase(Locale.ROOT)) {

            case "FOOD":
                number = "1";
                break;
            case "HOUSE":
                number = "2";
                break;
            case "EATING_OUT":
                number = "3";
                break;
            case "TOILETRY":
                number = "4";
                break;
            case "CAR":
                number = "5";
                break;
            case "TRANSPORT":
                number = "6";
                break;
            case "SPORT":
                number = "7";
                break;
            case "HEALTH":
                number = "8";
                break;
            case "ENTERTAINMENT":
                number = "9";
                break;
            case "TAXI":
                number = "10";
                break;
            case "CLOTHES":
                number = "11";
                break;
            case "COMMUNICATIONS":
                number = "12";
                break;
            default:
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(getCategoryIndex("CLOTHeS"));
    }
}
