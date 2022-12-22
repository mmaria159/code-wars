package com.mariamacovei.kata7kyu;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JadenCase {
    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        System.out.println(jadenCase.toJadenCase("most trees are blue"));
//        System.out.println(jadenCase.toJadenCase(null));
    }

    public String toJadenCase(String phrase) {
//        if (phrase == null || phrase.isEmpty()) {
//            return null;
//        } else {
//            String regex = "\\b(.)(.*?)\\b";
//            return Pattern.compile(regex).matcher(phrase).replaceAll(
//                    matche -> matche.group(1).toUpperCase() + matche.group(2)
//            );
//        }
            if (null == phrase || phrase.length() == 0) {
                return null;
            }

        Function<String, String> stringStringFunction = i -> i.substring(0, 1).toUpperCase() + i.substring(1);
        return Arrays.stream(phrase.split(" "))
                    .map(stringStringFunction)
                    .collect(Collectors.joining(" "));
        }
    }

