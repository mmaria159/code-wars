package com.mariamacovei.kata8kyu;

import java.util.*;

public class UnfinishedLoop {
    public static List CreateList(int number) {
        List list = new ArrayList();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }
}
