/**
 *    author:  Lunero
 *    created: 28.07.2025 13:48:54
 *    link: https://leetcode.com/problems/isomorphic-strings/description/
**/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false ;

        // marking 
        int[] a = new int [256] ;
        int[] b = new int [256] ;

        for (int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i) ;
            char d = t.charAt(i) ;

            if (a[c] == 0 && b[d] == 0)
            {
                a[c] = d ;
                b[d] = c ;
            }
            else if (a[c] != d || b[d] != c)
                return false ;
        }

        return true ;
    }
}