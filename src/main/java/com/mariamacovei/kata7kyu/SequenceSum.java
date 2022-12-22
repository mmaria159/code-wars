package com.mariamacovei.kata7kyu;

public class SequenceSum {
    public static void main(String args[]) {
        System.out.println(showSequence(-15));
    }

    public static String showSequence(int value) {
        if (value == 0) {
            return "0=0";
        } else if (value < 0) {
            return value + "<" + 0;
        }

        int sum = 0;
        String total = " ";
        for (int i = 0; i <= value; i++) {
            sum += i;
            total = total + i + "+";
        }
        return (total + "=" + sum).substring(1, (total + "=" + sum).length() - String.valueOf(sum).length() - 2) + "=" + sum;
    }
}
