package com.DSA;

public class IntegerToRoman {
    public static String integerToRoman(int val){
        int[] in = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        if(val == 0) return "";
        StringBuilder stb = new StringBuilder();
        for(int i =0 ; i<in.length;i++){
        while(val >= in[i]){
                val-=in[i];
                stb.append(str[i]);
            }
        }
        return stb.toString();
    }
    public static void main (String args[]){
       int val = 1994;
       String str = integerToRoman(val);
       System.out.println(str);
    }
}
