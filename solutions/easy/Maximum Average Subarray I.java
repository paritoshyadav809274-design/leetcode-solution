// Title: Maximum Average Subarray I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-average-subarray-i/

        double max=0;
        double value=0;
        for(int i=0;i<k;i++){
         max=max+nums[i];
         
        }
             value=max;
          for(int j=0;j<n-k;j++){
               value=value-nums[j]+nums[k+j];
              
              if(value >max){
                max=value;
              }
             
          }
          return max/k;

    }
}
        int n=nums.length;
    public double findMaxAverage(int[] nums, int k) {
class Solution {
