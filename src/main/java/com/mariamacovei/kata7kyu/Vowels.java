package com.mariamacovei.kata7kyu;

import java.util.Arrays;
import java.util.List;

public class Vowels {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }

    public static int getCount(String str) {
        int count = 0;
        List<Character> vowels = Arrays.asList('a', 'o', 'u', 'e', 'i');
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                count++;
            }

        }
        return count;
    }
}
