// Title: Remove Outermost Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-outermost-parentheses/

        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    res.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    res.append(c);
                }
            }
        }

        return res.toString();
    }
        StringBuilder res = new StringBuilder();
    public String removeOuterParentheses(String s) {
class Solution {
