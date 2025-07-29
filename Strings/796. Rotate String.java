/**
 *    author:  Lunero
 *    created: 29.07.2025 14:11:22
 *    link: https://leetcode.com/problems/rotate-string/description/
**/

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false ;
        else if (s.equals(goal))
            return true ;
        
        int startIndex = 0 ;
        int endIndex = s.length() ;

        for (int i = startIndex+1 ; i < s.length() ; i++)
        {
            if (s.substring(i, endIndex).equals(goal.substring(startIndex, endIndex - i)))
            {
                if (s.substring(0, i).equals(goal.substring(endIndex - i, endIndex)))
                    return true ;
            }
        }

        return false ;
    }
}