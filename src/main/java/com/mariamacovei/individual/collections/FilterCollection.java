package com.mariamacovei.individual.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FilterCollection {
    public static void main(String[] args) {
        List<String> stringList = List.of("Red", "Greenerr", "Blue");
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() < 5) {
                System.out.println(stringList.get(i));
            }

        }
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(13);
        myList.add(13);
        myList.add(13);
        myList.add(2);
        myList.add(2);
        myList.add(2);
        TreeSet<Integer> mySet = new TreeSet<>(myList);
        for (Integer set :  mySet) {
            System.out.println(set);
        }
    }
}
