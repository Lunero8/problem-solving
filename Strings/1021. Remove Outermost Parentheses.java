/**
 *    author:  Lunero
 *    created: 28.07.2025 00:59:33
 *    link: https://leetcode.com/problems/remove-outermost-parentheses/description/
**/

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder () ;

        int open = 0 ;
        int left = 0 ;

        for (int i = 0 ; i < s.length() ; i++)
        {
            if (s.charAt(i) == '(')
                open++ ;
            else
                open-- ;
            
            if (open == 0)
            {
                result.append(s.substring(left + 1, i)) ;
                left = i + 1 ;
            }
        } 

        return result.toString() ;
    }
}