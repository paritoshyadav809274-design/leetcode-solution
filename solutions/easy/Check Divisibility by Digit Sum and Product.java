// Title: Check Divisibility by Digit Sum and Product
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/

    public boolean checkDivisibility(int n) {
       int temp=n;

       int sum=0;
       int product=1;
        while(temp>0){
            int digit=temp%10;
        }
    }
            sum+=digit;
            product*=digit;
            temp=temp/10;
        int total=sum+product;
        return n%total==0;
}
class Solution {
