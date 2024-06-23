package com.DSA;
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] b= new boolean[n][n];
        if(n==0||s==null){
            return "";
        }
        int start =0,end = 0 ;
        for(int i =0 ; i < n;i++){
            b[i][i] =true;
            for(int j =0 ;j<i;j++){
                if (s.charAt(i) == s.charAt(j) && (i-j<=2 || b[j+1][i-1])){
                    b[j][i] = true;
                    if(i-j>end-start){
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end +1);
    }
}
public class LongestPolindrome {
    public static void main(String args[]) {
        Solution sol = new Solution();
        String s = "madam";
        String s1 = sol.longestPalindrome(s);
        System.out.println(s1);
    }
}