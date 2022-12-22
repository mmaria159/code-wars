package com.mariamacovei.kata7kyu.functionalprogrammingpart2;

import java.util.function.ToDoubleFunction;

public class FunctionalProgrammingPart2 {
    public static ToDoubleFunction<Triangle> f = (triangle) -> {
        double area = (double) (triangle.base * triangle.height) / 2;
        triangle.setArea(area);
        return area;
    };
}
