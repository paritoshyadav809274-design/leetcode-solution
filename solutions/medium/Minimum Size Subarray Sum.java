// Title: Minimum Size Subarray Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-size-subarray-sum/

     int left=0;
     int window=Integer.MAX_VALUE;
     for(int i=0;i<n;i++){
        sum+=nums[i];
     }
      }  
     int sum=0;
        while(sum>=target){
            window=Math.min(window,i-left+1);
        }
    }
            sum-=nums[left];
            left++;
     return window==Integer.MAX_VALUE?0:window;

     int n=nums.length;
    public int minSubArrayLen(int target, int[] nums) {
class Solution {
