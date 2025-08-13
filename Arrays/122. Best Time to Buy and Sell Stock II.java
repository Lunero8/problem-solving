/**
 *    author:  Lunero
 *    created: 13.08.2025 21:25:17
 *    link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
**/

class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0 ;
        int buying = prices[0] ;

        for (int n : prices)
            if (buying < n)
            {
                totalProfit += n - buying ;
                buying = n ;
            }
            else
                buying = n ;
        
        return totalProfit ;
    }
}