// Title: Binary Search
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-search/

      while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
      return -1;
    }
}
      int high=nums.length-1;
    public int search(int[] nums, int target) {
      int low=0;
class Solution {
