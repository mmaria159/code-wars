package com.mariamacovei.kata7kyu;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class AnagramDetection {
    public static void main(String[] args) {
        System.out.println(isAnagram("apple", "pale"));
    }
    public static boolean isAnagram(String test, String original) {
        List<String> collect1 = test.toUpperCase(Locale.ROOT).chars().mapToObj(Character::toString).collect(Collectors.toList());
        List<String> collect2 = original.toUpperCase(Locale.ROOT).chars().mapToObj(Character::toString).collect(Collectors.toList());
        return (collect1.retainAll(collect2) && collect2.retainAll(collect1));
    }
}
