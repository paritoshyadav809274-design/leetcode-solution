// Title: Length of Longest Subarray With at Most K Frequency
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/

     int left=0;
     int right=nums.length-1;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<=right;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        while(map.get(nums[i])>k){
            map.put(nums[left],map.get(nums[left])-1);
            left++;
        }
        maxlength=Math.max(maxlength,i-left+1);
     }
     return maxlength;

    }
}
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
     int maxlength=0;
