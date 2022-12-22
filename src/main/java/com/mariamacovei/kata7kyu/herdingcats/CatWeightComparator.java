package com.mariamacovei.kata7kyu.herdingcats;

import java.util.Comparator;

public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Double.compare(cat1.weight, cat2.weight);
    }
}
