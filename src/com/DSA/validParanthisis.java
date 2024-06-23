package com.DSA;


    import java.util.Stack;

public class validParanthisis {
        public static void main(String[] args) {
            String s = "{}[]()";

            boolean isValid = isValidParentheses(s);
            System.out.println("Is Valid: " + isValid);
        }

        public static boolean isValidParentheses(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }


