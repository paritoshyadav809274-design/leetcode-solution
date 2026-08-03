// Title: Subarray Sum Equals K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-sum-equals-k/

      map.put(0,1);
      int sum=0;
      int count=0;
       
      for(int ele:nums){
        sum+=ele;
      }
        int rem=sum-k;
        if(map.containsKey(rem)){
            count+=map.get(rem);
        }
    }
        map.put(sum,map.getOrDefault(sum,0)+1);
      return count;
}
