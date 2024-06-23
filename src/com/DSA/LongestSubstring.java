package com.DSA;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring
{
    public int lengthOfLongestSubstring(String s)
    {
        Map<Character,Integer> map = new HashMap<>();
        int count = 0, max = 0;
        if(s.length()==0||s==null)
        {
            return count;
        }
        int start = 0;
        int length = 0;
        // char[] c = s.toCharArray();
        for(int i = 0; i<s.length();i++)
        {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c)>= start)
            {
                start = map.get(c)+1;
            }
            else
            {
                length = Math.max(length,i-start+1);
            }
            map.put(c,i);
        }
        return length;
    }
    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();
        String input = "pwwkew";
        int length = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}
