package com.DSA;
import java.util.*;
public class RomanToInteger {
    public static int romanToInteger(String s){
        Map<Character,Integer>map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0,current =0 ,prev = 0;
        for(int i = s.length()-1;i>=0;i--) {
            if (s.charAt(i) == 'I' ||s.charAt(i) == 'V' ||s.charAt(i) == 'X' ||s.charAt(i) == 'L' ||s.charAt(i) == 'C' ||s.charAt(i) == 'D' ||
                    s.charAt(i) == 'M' ){
                current = map.get(s.charAt(i));
                if(current>=prev) sum+=current;
                else sum-=current;
                prev = current;
            }
            else return 0;

        }
        return sum;
    }
    public static void main(String args[]){
        String s = "MCMXCIV";
        int a  = romanToInteger(s);
        System.out.println("The value is : "+ a);
    }
}
