package com.mariamacovei.kata7kyu;

public class SumOfAngles {
    public static void main(String[] args) {
        System.out.println(sumOfAngles(8));
    }

    public static int sumOfAngles(int n) {
        return (n - 2) * 180;
    }
}
