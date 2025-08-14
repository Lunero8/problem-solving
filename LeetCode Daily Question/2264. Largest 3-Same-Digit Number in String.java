/**
 *    author:  Lunero
 *    created: 15.08.2025 02:44:51
 *    link: https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/?envType=daily-question&envId=2025-08-14
**/

class Solution {
    public String largestGoodInteger(String num) {
        String result = "" ;

        for (int i = 0 ; i < num.length() - 2 ; i++)
        {
            char c = num.charAt(i) ;

            if (c == num.charAt(i+1) && c == num.charAt(i+2))
            {
                String temp = num.substring (i, i+3) ;

                if (result.isEmpty() || temp.compareTo(result) > 0)
                    result = temp ;
            }
        }

        return result ;
    }
}