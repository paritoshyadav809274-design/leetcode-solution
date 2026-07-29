// Title: Two Sum
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/two-sum/

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];

            if(map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
    

       
class Solution {
    public int[] twoSum(int[] nums, int target) {
