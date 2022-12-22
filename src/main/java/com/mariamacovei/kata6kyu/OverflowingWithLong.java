package com.mariamacovei.kata6kyu;

public class OverflowingWithLong {
    public static void main(String[] args) {
    }

    public static long multiply(long a, long b) {
        // 1 solution
//        if (a * b != (double) a * b) throw new ArithmeticException();
//        else return a * b;
        //2 solution
        return Math.multiplyExact(a, b);
    }
}
