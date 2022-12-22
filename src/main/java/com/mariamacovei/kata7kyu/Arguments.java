package com.mariamacovei.kata7kyu;

import java.math.BigInteger;

public class Arguments {
    public static void main(String[] args) {
        System.out.println(countArgs(1, 2, 3));
        System.out.println(countArgs(1, 2, "uhsaf uas"));
        System.out.println(countArgs(1));
        System.out.println(countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
        System.out.println(countArgs());

    }
    public static int countArgs(Object... args) {
        return args.length;
    }
}
