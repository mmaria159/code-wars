package com.mariamacovei.kata7kyu;

public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }

    public static boolean isSquare(int n) {
        return n == 0 || Math.sqrt(n) % ((Double) Math.sqrt(n)).intValue() == 0;
    }

}
