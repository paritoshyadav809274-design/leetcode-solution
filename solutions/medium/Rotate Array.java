// Title: Rotate Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/rotate-array/

    }

public static int[] rotateArray(int i,int j,int nums[]){
    while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

      rotateArray(i,k-1,nums);
      rotateArray(k,j,nums);
        i++;
        j--;
    }
    return nums;
}
}
