// Title: Missing Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/missing-number/

    public int missingNumber(int[] nums) {
      Arrays.sort(nums);
     int left=0;
     int right=nums.length;
     while(left<right){
        if(nums[left]!=left){
     }
            return left;
        }
        else{
            left++;
        }
    }
     return nums.length;
}
class Solution {
