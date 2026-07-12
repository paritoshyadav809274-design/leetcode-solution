// Title: Longest Valid Parentheses
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/longest-valid-parentheses/

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
}
}
return max;  
    }
}
      int[] stack = new int[s.length() + 1];
    public int longestValidParentheses(String s) {
class Solution {
