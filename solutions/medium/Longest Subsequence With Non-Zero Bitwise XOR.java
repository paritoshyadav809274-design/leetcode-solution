// Title: Longest Subsequence With Non-Zero Bitwise XOR
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/

class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        if (xor != 0) {
            return nums.length;
        }
        for (int num : nums) {
            if (num != 0) {
                return nums.length - 1;
            }
        }
        return 0;
    }
}
