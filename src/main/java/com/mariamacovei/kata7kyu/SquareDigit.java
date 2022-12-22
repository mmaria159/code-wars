package com.mariamacovei.kata7kyu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.util.stream.Collectors.partitioningBy;

public class SquareDigit {
    public static void main(String[] args) {
        SquareDigit digit = new SquareDigit();
        System.out.println(digit.squareDigits(3212));
    }

    //My solution

//    public int squareDigits(int n) {
//        Integer arr[] = new Integer[0];
//        List<Integer> arrlist = new ArrayList<>(Arrays.asList(arr));
//        StringBuilder sum = new StringBuilder();
//
//        if (n == 0) {
//            return 0;
//        }
//
//        while (n > 0) {
//            int x = n % 10;
//            arrlist.add(x);
//            arr = arrlist.toArray(arr);
//            n = n / 10;
//        }
//
//        int[] b = new int[arr.length];
//        int j = arr.length;
//
//        for (Integer integer : arr) {
//            b[j - 1] = integer;
//            j = j - 1;
//        }
//        for (int k : b) {
//            sum.append(k * k);
//        }
//        return Integer.parseInt(sum.toString());
//    }

    //Other solution
//    public int squareDigits(int n) {
//        return Integer.parseInt(String.valueOf(n)
//                .chars()
//                .map(i -> Integer.parseInt(String.valueOf((char) i)))
//                        .map(i -> i * i)
//                        .mapToObj(String::valueOf)
//                        .collect(Collectors.joining("")));
//    }

    public int squareDigits(int n) {
        String returnvalue="";

        while(n > 0) {
           int i = n % 10;
            returnvalue = i*i + returnvalue;
            System.out.println(returnvalue);
            n /= 10;
        }
        return Integer.parseInt(returnvalue);
    }
}
