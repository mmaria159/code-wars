package com.mariamacovei.kata8kyu;

import java.util.Arrays;

public class SquareSum {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
    }

    public static int squareSum(int[] n) {
//        int sum = 0;
//        for (int j : n) {
//            sum += j * j;
//        }
//        return sum;
        return Arrays.stream(n).map(i->i*i).sum();
    }
}
