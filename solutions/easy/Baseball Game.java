// Title: Baseball Game
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/baseball-game/

                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        for (String op : operations) {
            if (op.equals("+")) {
        Stack<Integer> stack = new Stack<>();

import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
