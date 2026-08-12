// Title: Sum of Beauty of All Substrings
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-beauty-of-all-substrings/

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                for (int freq : map.values()) {
                    maxFreq = Math.max(maxFreq, freq);
                    minFreq = Math.min(minFreq, freq);
                }
                ans += (maxFreq - minFreq);
            }
        }
        return ans;
    }
            HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
        int ans = 0;
    public int beautySum(String s) {
class Solution {
