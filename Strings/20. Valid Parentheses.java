/**
 *    author:  Lunero
 *    created: 31.07.2025 16:30:46
 *    link: https://leetcode.com/problems/valid-parentheses/description/
**/

class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>() ;

        for (char c : s.toCharArray())
        {
            if (c == '(' || c == '{' || c == '[')
                stack.push (c) ;
            else
            {
                if (stack.isEmpty())
                    return false ;
                
                char top = stack.pop () ;

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '['))
                    return false ;
            }
        }

        return stack.isEmpty () ;
    }
}