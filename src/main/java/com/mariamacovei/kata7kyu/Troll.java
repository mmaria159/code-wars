package com.mariamacovei.kata7kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        //1st solution
//        return str.replaceAll("[aouieAOUIE]", "");
        //second solution
        return Arrays.asList(str.split("")).stream().filter(s -> s.matches("[^aouieAOUIE]")).collect(Collectors.joining(""));
    }
}