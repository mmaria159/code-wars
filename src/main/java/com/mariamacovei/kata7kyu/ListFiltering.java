package com.mariamacovei.kata7kyu;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));

    }
    public static List<Object> filterList(final List<Object> list) {
      return list.stream().filter(a->a instanceof Integer).collect(Collectors.toList());
    }
}