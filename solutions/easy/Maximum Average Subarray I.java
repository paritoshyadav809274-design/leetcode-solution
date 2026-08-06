// Title: Maximum Average Subarray I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n=nums.length;
       double max=0;
       double value=0;
       for(int i=0;i<k;i++){
        max+=nums[i];
       }
       value=max;
       for(int i=0;i<n-k;i++){
        value=value-nums[i]+nums[k+i];
        max=Math.max(value,max);
       }
       return max/k;

    }
}
