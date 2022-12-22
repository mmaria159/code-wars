package com.mariamacovei.kata8kyu;

public class School {
    public static void main(String[] args) {
        getAverage(new int[]{2, 2, 2, 2});
    }

    public static int getAverage(int[] ints) {
        int sum = 0;
        int average = 0;
        for (int anInt : ints) {
            sum = sum + anInt;
        }
        average = (int) Math.floor(sum / ints.length);
        return average;
    }
}
