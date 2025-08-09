/**
 *    author:  Lunero
 *    created: 09.08.2025 13:50:56
 *    link: https://leetcode.com/problems/power-of-two/description/?envType=daily-question&envId=2025-08-09
**/

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0 ;
    }
}