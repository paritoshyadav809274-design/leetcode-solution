// Title: Next Greater Element I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/next-greater-element-i/

                stack.pop();
            }

            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }

            stack.push(nums2[i]);
        }

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
class Solution {

import java.util.*;
