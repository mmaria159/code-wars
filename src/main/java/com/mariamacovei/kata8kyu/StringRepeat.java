package com.mariamacovei.kata8kyu;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));

    }

    public static String repeatStr(final int repeat, final String string) {
        //MY SOLUTION
//        return Stream.of(string).map(i->i.repeat(repeat)).collect(Collectors.joining(""));
        // Other fun solution
        return string.repeat(repeat);
    }
}
