// Title: Check if Array Is Sorted and Rotated
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

class Solution {
    public boolean check(int[] nums) {
     int n=nums.length;
     int swap=0;
     for(int i=0;i<n;i++){
      if(nums[i]>nums[(i+1)%n]){
        swap++;
         if(swap>1){
            return false;
         } 
      }
     } 
     return true;  
    }
}
