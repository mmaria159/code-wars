package com.mariamacovei.kata6kyu;
import java.lang.StringBuilder;


public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth_Warrio"));

    }
    public static String toCamelCase(String s){
        StringBuilder stringBuilder= new StringBuilder(s);
        System.out.println(s.replaceAll("_", " "));
        return "";
    }
}
