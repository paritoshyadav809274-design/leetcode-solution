// Title: Majority Element II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/majority-element-ii/

                count2 = 1;
            } 
            else {
                count1--;
                count2--;
            } 
            else if (count2 == 0) {
                candidate2 = num;
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } 
            else if (num == candidate2) {
                count2++;
            } 
                count1++;
            if (num == candidate1) {
        for (int num : nums) {
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
    public List<Integer> majorityElement(int[] nums) {
class Solution {
