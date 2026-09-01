// Title: Minimum Operations to Make Array Sum Divisible by K
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/

class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum % k;
    }
}
