package com.mariamacovei.kata7kyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static java.util.Arrays.stream;
import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.util.stream.Collectors.toList;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    //1 solution
    public static String highAndLow1(String numbers) {
        int min = stream(numbers.split(" ")).mapToInt(Integer::parseInt).sorted().findFirst().getAsInt();
        int max = stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        return max + " " + min;
    }

    //2 solution
//    public static String highAndLow2(String numbers) {
//        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
//        return stats.getMax() + " " + stats.getMin();
//    }
    //3 solution
//    public static String highAndLow3(String numbers) {
//        List<Integer> nums = stream(numbers.split(" ")).map(Integer::parseInt).collect(toList());
//        return format("%s %s", max(nums), min(nums));
//    }

    public static String highAndLow(String numbers) {
        List<Integer> nums = stream(numbers.split(" ")).map(Integer::parseInt).collect(toList());
        return format("%s %s", max(nums), min(nums));
    }

}