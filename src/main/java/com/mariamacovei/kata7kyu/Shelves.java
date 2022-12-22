package com.mariamacovei.kata7kyu;

public class Shelves {
    public static void main(String[] args) {
        System.out.println(solution(452, 837));
    }

    public static int solution(int start, int finish) {

        return (finish - start) / 3 + (finish - start) % 3;
    }
}
