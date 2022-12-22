package com.mariamacovei.kata6kyu;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static void main(String[] args) {
//        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        System.out.println(findIt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
//        System.out.println(findIt(new int[]{0,1,0,1,0}));
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : a) {
            if (map.containsKey(map.get(j))) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        System.out.println(map);
        for (Integer name : map.keySet()) {
            if ((map.get(name) % 2) != 0)
                return name;
        }
        return 0;
    }
}
