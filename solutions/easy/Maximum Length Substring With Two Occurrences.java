// Title: Maximum Length Substring With Two Occurrences
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/

    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxlen=0;
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
     }
        while(map.get(ch)>2){
          map.put(leftchar,map.get(leftchar)-1);
        }
    }
        int left=0;
        maxlen=Math.max(maxlen,max);
          left++;
        int max=0;
        max=i-left+1;
     return maxlen; 
            char leftchar=s.charAt(left);
}
class Solution {
