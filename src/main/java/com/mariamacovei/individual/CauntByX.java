package com.mariamacovei.individual;

import java.util.HashMap;
import java.util.Map;

public class CauntByX {
    public static void main(String[] args) {
        String world = "abbcdda";
        char[] arrays2 = world.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        for (char c : arrays2) {
            if (map.containsKey(c)) {
                count = map.get(c) + 1;
                map.put(c, count);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
