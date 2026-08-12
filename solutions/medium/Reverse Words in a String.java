// Title: Reverse Words in a String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
      String[] t=s.trim().split("\\s+");
      StringBuilder sb=new StringBuilder();
      for(int i=t.length-1;i>=0;i--){
        sb.append(t[i]);
        if(i!=0){
      }
            sb.append(" ");
        }
    }
      return sb.toString();
}
