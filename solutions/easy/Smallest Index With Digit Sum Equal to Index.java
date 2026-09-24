// Title: Smallest Index With Digit Sum Equal to Index
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            if (sum == i) {
                return i;
            }
        }
        return -1;
class Solution {
    public int smallestIndex(int[] nums) {
    }
}
