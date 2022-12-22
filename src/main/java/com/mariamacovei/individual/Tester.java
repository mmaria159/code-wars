package com.mariamacovei.individual;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {
        multiTable(5);
    }
    public static String multiTable(int num) {
        System.out.println(concateString(new char[]{'G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's'}));
        return IntStream.rangeClosed(1, 10).mapToObj(i -> i + "x" + num + "=" + i * num).collect(Collectors.joining("\n"));
    }

    public static String concateString(char[] ch) {
        return Stream.of(ch).map(String::new).collect(Collectors.joining());
    }
}
