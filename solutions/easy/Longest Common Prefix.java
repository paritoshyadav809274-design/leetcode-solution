// Title: Longest Common Prefix
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
    for(int i=1;i<strs.length;i++){
       String b=strs[i];
       while(!b.startsWith(s)){
        s=s.substring(0,s.length()-1);
       }
    }
        if(s.length()==0){
            return "";
        }
    }
    return s;
}
