// Title: Implement Queue using Stacks
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/implement-queue-using-stacks/

class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        stack2.push(x);

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
