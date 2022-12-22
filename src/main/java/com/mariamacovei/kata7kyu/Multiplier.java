package com.mariamacovei.kata7kyu;

public class Multiplier {
    public static void main(String[] args) {
        System.out.println(multiply(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(Multiplier.multiply(42966, 49981));
    }

    public static int multiply(int a, int b) {
//        if ((long) a * b > Integer.MAX_VALUE || (long) a * b < Integer.MIN_VALUE)
//            throw new ArithmeticException("Overflow exception");
//        return a * b;
        return Math.multiplyExact(a, b);
    }
}
