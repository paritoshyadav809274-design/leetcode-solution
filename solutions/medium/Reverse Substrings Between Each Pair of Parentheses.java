// Title: Reverse Substrings Between Each Pair of Parentheses
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(curr);
                curr = new StringBuilder();
            } 
            else if (ch == ')') {
                curr.reverse();
                curr = stack.pop().append(curr);
            } 
            else {
                curr.append(ch);
            }
        }

        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder curr = new StringBuilder();
class Solution {
    public String reverseParentheses(String s) {
