// Title: Find Peak Element
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-peak-element/

       int start=0;
       int end=nums.length-1;
       while(start<end){
        int mid=start+(end-start)/2;
        if(nums[mid]<=nums[mid+1]){
            start=mid+1;

        }
        else{
             end=mid;
        }
       }
       return start; 
    }
}
    public int findPeakElement(int[] nums) {
class Solution {
