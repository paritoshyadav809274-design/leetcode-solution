// Title: Sort Colors
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-colors/


        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
        int mid = 0;
        int high = nums.length - 1;
    public void sortColors(int[] nums) {
        int low = 0;
class Solution {
