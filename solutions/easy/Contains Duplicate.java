// Title: Contains Duplicate
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int ele:nums){
        map.put(ele,map.getOrDefault(ele,0)+1);
       }
       for(int key:map.keySet()){
        if(map.get(key)>1){
       }
            count++;
        }
    }
       int count=0;
       return count==0?false:true;
}
