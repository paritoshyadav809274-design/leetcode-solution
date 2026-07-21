// Title: Max Consecutive Ones
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int swap=0;
       int max=0;
       for(int ele:nums){
        if(ele!=1){
            swap=0;
        }
         max=   Math.max(max,swap);
        else{
            swap++;
        }
    }
        
       }
       return Math.max(max,swap);
}
