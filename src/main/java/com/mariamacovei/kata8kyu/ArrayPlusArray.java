package com.mariamacovei.kata8kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayPlusArray {
    public static void main(String[] args) {
        arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).reduce(0, Integer::sum);
    }
}
