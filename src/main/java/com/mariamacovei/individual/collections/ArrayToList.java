package com.mariamacovei.individual.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>();
        for (int j : array) {
            list.add(j);
        }
        System.out.println(list + " hello");

        List<Integer> list1 = List.of(1, 3, 4);
        int[] myInt = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            myInt[i] = list1.get(i);
            System.out.println(myInt[i]);
        }
    }
}
