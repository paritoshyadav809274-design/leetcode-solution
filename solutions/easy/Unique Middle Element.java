// Title: Unique Middle Element
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/unique-middle-element/

class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        int mid = nums.length / 2;
        return map.get(nums[mid]) == 1;
    }
}
