package com.mariamacovei.kata8kyu;

public class WillYouMakeIt {
    public static void main(String[] args) {
        System.out.println(zeroFuel(50, 25, 2));
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return mpg * fuelLeft >= distanceToPump;
    }
}
