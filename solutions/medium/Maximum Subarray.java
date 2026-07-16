// Title: Maximum Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
     int maxsum=nums[0];
     for(int i=0;i<nums.length;i++){
         sum+=nums[i]; 
     }

     int sum=0;
     
     
     int k=nums.length-1;
    }
         if(sum>maxsum) maxsum=sum;
         if(sum<0) sum=0;
     return maxsum;
}
