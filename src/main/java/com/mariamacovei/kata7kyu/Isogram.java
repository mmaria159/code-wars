package com.mariamacovei.kata7kyu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.Set;

public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("aniscb"));
    }

    public static boolean isIsogram(String str) {
//        Set<Character> set = new HashSet<>();
//        for (Character charr : str.toLowerCase().toCharArray()) {
//            set.add(charr);
//        }
//        return str.length() == set.size();
//    }

//        return str.length()== str.toLowerCase().chars().distinct().count();
//    }
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : str.toLowerCase().toCharArray()) {
            if (map.containsKey(aChar)) {
                return false;
            } else {
                map.put(aChar, 1);
            }
        }
        return true;
    }
}
