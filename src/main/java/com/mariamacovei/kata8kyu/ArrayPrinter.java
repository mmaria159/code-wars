package com.mariamacovei.kata8kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {
    public static void main(String[] args) {
        System.out.println(printArray(new String[]{"h", "o", "l", "a"}));

    }

    public static String printArray(Object[] array) {
//        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            str.append(array[i]).append(",");
        }
       return str.substring(0, str.length()-1);

    }
}
