package com.mariamacovei.kata7kyu.functionalprogrammingpart1;

import java.util.function.Function;

public class FunctionalProgrammingPart1 {
    public static Function<Student, Boolean> f = student -> student.getFullName().equals("John Smith") && student.studentNumber.equals("js123");
// soluion2

//    public static Function<Student, Boolean> f = new Function<Student, Boolean>() {
//        @Override
//        public Boolean apply(Student student) {
//            return student.getFullName().equals("John Smith") && student.studentNumber.equals("js123");
//        }
//    };
}
