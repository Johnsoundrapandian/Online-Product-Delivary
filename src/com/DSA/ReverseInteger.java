package com.DSA;

public class ReverseInteger {
    static int reverseInteger(int x){
        long num =0 ;
        int res = 0;
        if(x==-2147483648)return 0;
        boolean isNegative = x<0;
        if(isNegative){
            x =x*-1;
        }
        while(x>0){
            num= (num*10)+(x%10);
            x=x/10;
            if(num>Integer.MAX_VALUE) return 0;
        }
        res = (int)num;
        return isNegative?res*-1:res;
    }
    public static void main(String[] args){
        int x =-121;
        int a = reverseInteger(x);
        System.out.println(a);
    }
}
