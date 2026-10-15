// Title: Subarrays Distinct Element Sum of Squares I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/

    public int sumCounts(List<Integer> nums) {
        long ans = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                set.add(nums.get(j));
                int distinct = set.size();
                ans += (long) distinct * distinct;
            }
        }
        return (int) ans;
class Solution {
import java.util.*;
    }
}
