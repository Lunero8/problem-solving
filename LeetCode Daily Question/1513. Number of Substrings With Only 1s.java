/**
 *    author:  Lunero
 *    created: 16.11.2025 06:32:43
 *    link: https://leetcode.com/problems/number-of-substrings-with-only-1s/description/?envType=daily-question&envId=2025-11-16
**/

class Solution {
    public int numSub(String s) {
        long count = 0 ;

        int index = 0 ;
        long c_count = 0 ;
        // long mod = 1000000007 ;

        while (index < s.length()) {
            if (s.charAt(index) == '0') {
                c_count = 0 ;
            }
            else {
                c_count++ ;
                count += c_count ;
                // count %= mod ;
            }

            index++ ;
        }

        return (int)(count % 1000000007) ;
        // return (int) count ;
    }
}