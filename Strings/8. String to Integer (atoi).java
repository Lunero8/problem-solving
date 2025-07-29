/**
 *    author:  Lunero
 *    created: 29.07.2025 19:10:01
 *    link: https://leetcode.com/problems/string-to-integer-atoi/description/
**/

class Solution {
    public int myAtoi(String s) {
        int result = 0 ;
        int sizeOfS = s.length() ;
        int i = 0 ;
        int plusOrMinus = 1 ;

        // remove leading 0
        while (i < sizeOfS && s.charAt(i) == ' ') {
            i++ ;
        }

        // check sign 
        if (i < sizeOfS && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            plusOrMinus = s.charAt(i) == '-' ? -1 : 1 ;

            i++ ;
        }

        while (i < sizeOfS && Character.isDigit (s.charAt(i))) {
            int digit = s.charAt(i) - '0' ;

            // handle overflow
            if (result > (Integer.MAX_VALUE - digit) / 10)
                return plusOrMinus == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE ;
            
            result = result * 10 + digit ;

            i++ ;
        }

        return result * plusOrMinus ;
    }
}