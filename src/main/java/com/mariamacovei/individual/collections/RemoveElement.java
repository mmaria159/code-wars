package com.mariamacovei.individual.collections;

import java.util.Iterator;
import java.util.List;

public class RemoveElement {
    static List<Integer> myList = List.of(1, 2, 3, 45);

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 45);
        Iterator<Integer> iter2 = myList.iterator();
        while (iter2.next()==45) {
            iter2.remove();
        }

        for (Iterator<Integer> it = iter2; it.hasNext(); ) {
            Integer integer = it.next();
            System.out.println(integer);


        }

    }
}
