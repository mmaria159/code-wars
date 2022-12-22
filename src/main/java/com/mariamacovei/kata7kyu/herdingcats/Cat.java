package com.mariamacovei.kata7kyu.herdingcats;

import java.util.Arrays;

public class Cat implements Comparable<Cat> {
    public String name;
    public double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Lily", 30);
        cats[1] = new Cat("Drake", 15);

        Arrays.sort(cats, new CatWeightComparator());

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].weight);
        }
    }
}