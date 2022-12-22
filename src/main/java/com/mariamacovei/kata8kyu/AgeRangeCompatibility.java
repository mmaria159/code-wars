package com.mariamacovei.kata8kyu;

public class AgeRangeCompatibility {
    public static void main(String[] args) {
        System.out.println(datingRange(10));

    }

    public static String datingRange(int age) {
        return age / 2 + 7 + "-" + (age - 7) * 2;
    }
}
