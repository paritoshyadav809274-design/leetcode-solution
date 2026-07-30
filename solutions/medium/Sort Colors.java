// Title: Sort Colors
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-colors/

        }
        else if(nums[left]==2){
           int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            zero++;
        right--;
            left++;
            nums[zero]=temp;
            nums[left]=nums[zero];
            int temp=nums[left];
     while(left<=right){
        if(nums[left]==0){
     int zero=0;
     int right=nums.length-1;
     int left=0;
    public void sortColors(int[] nums) {
class Solution {
