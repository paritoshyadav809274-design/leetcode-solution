// Title: Minimize Maximum Pair Sum in Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/


        int left = 0;
        int right = nums.length - 1;
        int maxSum = 0;

        while (left < right) {

            int sum = nums[left] + nums[right];

            maxSum = Math.max(maxSum, sum);

            left++;
            right--;
        }

        Arrays.sort(nums);
    public int minPairSum(int[] nums) {

class Solution {
