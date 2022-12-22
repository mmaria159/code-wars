package com.mariamacovei.kata8kyu;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{-9, 2, -3, 4, -5})));
    }

    public static int[] invert(int[] array) {
//        int[] array2 = new int[array.length];
//        for (int j = 0; j < array.length; j++) {
//            array2[j] = array[j] * (-1);
//        }
//        return array2;
        return Arrays.stream(array).map(i -> -i).toArray();
    }
}
