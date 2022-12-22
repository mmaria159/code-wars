package com.mariamacovei.individual;

public class MyArray {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        int[][][] array2 = {{{1, 2, 7}, {7, 8, 9}}, {{1, 2, 7}, {7, 8, 9}}, {{1, 2, 7}, {7, 8, 9}}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(array2[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

