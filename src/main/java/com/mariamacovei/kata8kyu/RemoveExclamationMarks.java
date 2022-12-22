package com.mariamacovei.kata8kyu;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveExclamationMarks {
    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello World!"));

    }

    public static String removeExclamationMarks(String s) {
        return Stream.of(s.split("")).filter(i -> i.matches("[^!]")).collect(Collectors.joining(""));

    }
}
