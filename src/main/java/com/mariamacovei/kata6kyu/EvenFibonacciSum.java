package com.mariamacovei.kata6kyu;

public class EvenFibonacciSum {

    public static void main(String[] args) {
        System.out.println(fibonacci(111111));

    }

    public static long fibonacci(long max) {
        long firstTerm = 0, secondTerm = 1, nextTerm = 0, sum = 0;
        System.out.println("Fibonacci Series Upto " + max + ": ");
        do {
            System.out.print(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            if (nextTerm % 2 == 0) {
                sum += nextTerm;
            }
        } while (firstTerm <= max);
        return sum;
    }
}
