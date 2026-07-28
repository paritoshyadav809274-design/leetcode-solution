// Title: Single Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
    int sum=0;
    for(int ele:nums){
        sum^=ele;
    }
    }
    return sum;
}
