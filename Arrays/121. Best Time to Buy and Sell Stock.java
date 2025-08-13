/**
 *    author:  Lunero
 *    created: 13.08.2025 21:16:03
 *    link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
**/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0 ;
        int buying = prices[0] ;

        for (int n : prices)
            if (buying < n)
                maxProfit = Math.max (maxProfit, n - buying) ;
            else
                buying = n ;

        return maxProfit ;
    }
}