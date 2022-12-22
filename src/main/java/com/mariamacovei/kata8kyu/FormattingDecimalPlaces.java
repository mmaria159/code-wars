package com.mariamacovei.kata8kyu;

public class FormattingDecimalPlaces {
    public static void main(String[] args) {
        System.out.println(TwoDecimalPlaces(173735326.3783732637948948));
    }

    public static double TwoDecimalPlaces(double number) {
        return (double) Math.round(number * 100) / 100;
    }
}
