package com.mariamacovei.kata7kyu;
import static java.util.stream.Collectors.joining;

public class DigitsExplosion {
    public static void main(String[] args) {
//        System.out.println(explode("312"));

    }

    public static String explode(String digits) {
        return digits.chars()
                .mapToObj(Character::toString)
                .map(i -> i.repeat(Integer.parseInt((i)))).collect(joining());
    }
}
