package com.DSA;

public class StringToInteger {
    public static int stringToInt(String val){
        int a = Integer.parseInt(val);
        return a;
    }
    public static void main(String args[]){
        String a ="123";
        int b = stringToInt(a);
        System.out.println(b);
    }
}
