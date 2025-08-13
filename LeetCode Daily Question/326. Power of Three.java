/**
 *    author:  Lunero
 *    created: 13.08.2025 13:52:13
 *    link: https://leetcode.com/problems/power-of-three/description/?envType=daily-question&envId=2025-08-13
**/

class Solution {
    public boolean isPowerOfThree(int n) {

        // Approach 3
        if (n < 1)
            return false ;
        
        while (n % 3 == 0)
            n /= 3 ;
        
        return n == 1 ;

        /* --Approach 1
        return n > 0 && 1162261467 % n == 0 ; // the largest power of 3 is 1162261467 (which is 3^19)
        */

        /* --Approach 2
        if (n == 1)
            return true ;
        if (n <= 0 || n % 3 != 0)
            return false ;
        
        return isPowerOfThree(n / 3) ;
        */
    }
}