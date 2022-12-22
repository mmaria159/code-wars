package com.mariamacovei.kata8kyu;

import java.util.TreeSet;

public class MaxAndMinOfList {
    public static void main(String[] args) {
        MaxAndMinOfList maxAndMinOfList = new MaxAndMinOfList();
        System.out.println(maxAndMinOfList.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));

    }
    public int min(int[] list) {
//        return Arrays.stream(list).min().getAsInt();
        TreeSet<Integer> setMin = new TreeSet<>();
        for(Integer i : list) {
            setMin.add(i);
        }
        return setMin.first();
    }

    public int max(int[] list) {
//        return Arrays.stream(list).max().getAsInt();
        int max = list[0];
        int next = 0;
        for (int i = 0; i < list.length; i++){
            next = list[i];
            if(next > max){
                max = next;
            }
        }
        return max;
    }
}
