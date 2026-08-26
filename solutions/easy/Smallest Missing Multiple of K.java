// Title: Smallest Missing Multiple of K
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-missing-multiple-of-k/

class Solution {
    public int missingMultiple(int[] nums, int k) {
     HashSet<Integer> set = new HashSet<>();

for (int ele : nums) {
    set.add(ele);
}

for (int i = 1; ; i++) {
    int product = k * i;

    if (!set.contains(product)) {
        return product;
    }
}
    }
}
