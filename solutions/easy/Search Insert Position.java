// Title: Search Insert Position
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/search-insert-position/

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }

        int high = nums.length - 1;

        int low = 0;
class Solution {
    public int searchInsert(int[] nums, int target) {
