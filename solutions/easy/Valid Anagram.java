// Title: Valid Anagram
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-anagram/

        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
            return false;
        if (s.length() != t.length()) {
    public boolean isAnagram(String s, String t) {

class Solution {
