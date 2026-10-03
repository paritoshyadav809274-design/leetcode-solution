// Title: Longest Valid Parentheses
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/longest-valid-parentheses/

class Solution {
    public int longestValidParentheses(String s) {
      int[] stack = new int[s.length() + 1];
int index = -1;
stack[++index] = -1;
int max = 0;
for (int i = 0; i < s.length(); i++) {
if (s.charAt(i) == '(') {
stack[++index] = i;
} else {
index--;
if (index == -1) {
stack[++index] = i;
} else {
max = Math.max(max, i - stack[index]);
}
