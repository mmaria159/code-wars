package com.mariamacovei.kata8kyu;

import java.util.Arrays;
import java.util.Collections;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(grow(new String[]{"tail", "body", "head"})));
    }

    public static String[] grow(String[] x) {
         Collections.reverse(Arrays.asList(x));
         return x;
    }
}
