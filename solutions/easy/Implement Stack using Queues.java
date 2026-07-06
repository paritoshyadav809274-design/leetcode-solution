// Title: Implement Stack using Queues
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/implement-stack-using-queues/

        return q1.poll();
    }
    public int top() {
        return q1.peek();
    public int pop() {
    }
        q1 = q2;
        q2 = temp;
        }
        Queue<Integer> temp = q1;
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int x) {
        q2.offer(x);
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
