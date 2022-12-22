package com.mariamacovei.kata7kyu;

public class AlternateSquareSum {
    public static void main(String[] args) {
        System.out.println(alternateSqSum(new int[]{13, 5, 8, 11, 8, 6}));
    }

    public static int alternateSqSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i] * arr[i];
            } else {
                sum += arr[i];
            }
        }
        return sum;
    }
}
