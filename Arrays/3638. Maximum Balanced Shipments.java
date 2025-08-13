/**
 *    author:  Lunero
 *    created: 13.08.2025 23:51:46
 *    link: https://leetcode.com/problems/maximum-balanced-shipments/description/
**/

class Solution {
    public int maxBalancedShipments(int[] weight) {
        int count = 0 ;
        int max = weight[0] ;

        for (int i = 1 ; i < weight.length ; i++)
        {
            if (max > weight[i])
            {
                count++ ;
                
                if (i == weight.length - 1)
                    break ;
                
                max = weight[++i] ;
            }
            else if (max < weight[i])
                max = weight[i] ;
        }

        return count ;
    }
}