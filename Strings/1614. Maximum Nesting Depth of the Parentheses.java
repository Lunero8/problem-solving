/**
 *    author:  Lunero
 *    created: 28.07.2025 00:17:33
 *    link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
**/

class Solution {
    public int maxDepth(String s) {
        int count = 0 ;
        int result = 0 ;
        for (int i = 0 ; i < s.length() ; i++)
        {
            if (s.charAt(i) == '(')
                count++ ;
            else if (s.charAt(i) == ')')
                count-- ;

            if (count > result)
                result = count ;
        }

        return result ;
    }
}