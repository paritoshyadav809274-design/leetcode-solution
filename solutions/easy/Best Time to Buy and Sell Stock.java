// Title: Best Time to Buy and Sell Stock
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

    int minprice=prices[0];
    public int maxProfit(int[] prices) {
class Solution {
    int maxprofit=0;
    for(int i=1;i<prices.length;i++){
        if(prices[i]<minprice){
    }
            minprice=prices[i];
        }

        else{
            maxprofit=Math.max(maxprofit,prices[i]-minprice);
    }
    }
    return maxprofit;
}
