// Title: Roman to Integer
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/roman-to-integer/

        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            if (i < s.length() - 1 &&
                current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('I', 1);
        map.put('V', 5);
        HashMap<Character, Integer> map = new HashMap<>();
    public int romanToInt(String s) {
class Solution {
