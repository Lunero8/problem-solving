/**
 *    author:  Lunero
 *    created: 04.09.2025 22:02:40
 *    link: https://leetcode.com/problems/find-closest-person/description/?envType=daily-question&envId=2025-09-04
**/

class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs (z-x) ;
        int b = Math.abs (z-y) ;

        if (a < b)
            return 1 ;
        else if (b < a) 
            return 2 ;
        
        return 0 ;
    }
}