package com.mariamacovei.kata8kyu;

import java.util.Locale;
import java.util.stream.Stream;

public class AlternativeString {
    public static void main(String[] args) {
        System.out.println(toAlternativeString("hello world"));

    }
    public static int square(int n) {
        return (int) Math.pow(n,2);
    }
    public static String toAlternativeString(String string) {
        char[] chars = string.toCharArray();
//        String[] split1 = string.split("");
        String s;
        for (int i = 0; i < chars.length; i++) {
            boolean upperCase = Character.isUpperCase(chars[i]);
            if (upperCase) {
//                s += chars[i].toLowerCase(Locale.ROOT);
            } else {
//                s += chars[i].toUpperCase(Locale.ROOT);
            }
        }

        return "s";
    }
}
