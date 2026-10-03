// Title: Longest Valid Parentheses
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/longest-valid-parentheses/

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
}
}
return max;  
int max = 0;
stack[++index] = -1;
      int[] stack = new int[s.length() + 1];
int index = -1;
class Solution {
    public int longestValidParentheses(String s) {
