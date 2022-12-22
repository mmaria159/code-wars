package com.mariamacovei.individual;

import java.util.HashMap;
import java.util.Map;

public class NrOfReapeatingCharInString {
    public static void main(String[] args) {
        String str = "abbccc"; // OUTPUT : a = 1, b = 2, c = 3

        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            if (map.containsKey(c)) {
                int count = map.get(c) + 1;
                map.put(c, count);
            } else {
                map.put(c, 1);
            }
        }
    }
}
