package com.mariamacovei.kata7kyu;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentItemCount {
    public static void main(String[] args) {
//        System.out.println(mostFrequentItemCount(new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
        System.out.println(mostFrequentItemCount(new int[]{}));

    }

    public static int mostFrequentItemCount(int[] collection) {
        if (collection.length == 0) {
            return 0;
        }
            Map<Integer, Integer> map = new HashMap<>();
        for (int j : collection) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        return map.values().stream().sorted(Comparator.reverseOrder()).findFirst().get();
    }
}
