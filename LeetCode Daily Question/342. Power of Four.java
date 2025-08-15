/**
 *    author:  Lunero
 *    created: 15.08.2025 15:45:07
 *    link: https://leetcode.com/problems/power-of-four/description/?envType=daily-question&envId=2025-08-15
**/

class Solution {
    public boolean isPowerOfFour(int n) {
        // Approach 2
        if (n < 1)
            return false ;

        while (n % 4 == 0)
            n /= 4 ;
        
        return n == 1 ;
        
        /*--Approach 1
        if (n < 1)
            return false ;

        if (n == 1)
            return true ;
        
        if (n % 4 != 0)
            return false ;

        return isPowerOfFour (n/4) ;
        */
    }
}