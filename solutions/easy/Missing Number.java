// Title: Missing Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/missing-number/

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
    


