// Title: Baseball Game
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/baseball-game/

                int b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }else if(op.equals("D")){
                stack.push(stack.peek()*2);
            }else if(op.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
            if(op.equals("+")){
                int a=stack.pop();
        for(String op:operations){
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
import java.util.Stack;
class Solution {
