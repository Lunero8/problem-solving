/**
 *    author:  Lunero
 *    created: 04.08.2025 15:37:26
 *    link: https://leetcode.com/problems/fruit-into-baskets/description/?envType=daily-question&envId=2025-08-04
**/

class Solution {
    public int totalFruit(int[] fruits) {
        int result = 0 ;

        int f1 = -1 ;
        int f2 = -1 ;
        int lastf = -1 ;
        int lcount = 0 ;
        int clen = 0 ;

        for (int a : fruits)
        {
            if (a == f1 || a == f2)
                clen++ ;
            else
                clen = lcount + 1 ;

            if (a == lastf)
                lcount++ ;
            else
            {
                lcount = 1 ;
                f1 = f2 ;
                f2 = a ;
                lastf = a ;
            }

            result = Math.max (result, clen) ;
        }

        return result ;
    }
}