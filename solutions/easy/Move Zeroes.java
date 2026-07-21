// Title: Move Zeroes
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        
        int j=0;
      for(int k=0;k<nums.length;k++){
           if(nums[k]!=0){
      }

            int temp=nums[k];
           }
            nums[k]=nums[j];
            nums[j]=temp;
              j++;
           
    }
}
