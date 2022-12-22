package com.mariamacovei.kata6kyu;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("  afara    este frig"));
    }

    public static String camelCase(String str) {
        if (str.equals("")) {
            return "";
        }
        return Arrays.stream(str.trim().split("\\s+"))
                .map(i -> i.substring(0, 1)
                        .toUpperCase(Locale.ROOT) + i.substring(1))
                .collect(Collectors.joining());
    }
}
