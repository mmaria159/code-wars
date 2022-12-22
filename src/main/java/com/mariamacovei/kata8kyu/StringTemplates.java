package com.mariamacovei.kata8kyu;

import java.util.Objects;

public class StringTemplates {
    public static void main(String[] args) {
        System.out.println(buildString("Cheese", "Milk", "Chocolate"));
        System.out.println(buildString());
    }

    public static String buildString(String... args) {

        StringBuilder s = new StringBuilder();
        for (String arg : args) {
            s.append(arg).append(", ");
        }
        return (Objects.nonNull(args) && args.length != 0) ? "I like " + s.substring(0, s.length() - 2) + "!" : null;

    }
}
