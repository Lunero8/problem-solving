/**
 *    author:  Lunero
 *    created: 29.07.2025 14:22:32
 *    link: https://leetcode.com/problems/valid-anagram/description/
**/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false ;
        else if (s.equals(t))
            return true ; 

        char[] a = s.toCharArray() ;
        char[] b = t.toCharArray() ;

        Arrays.sort(a) ;
        Arrays.sort(b) ;

        for (int i = 0 ; i < a.length ; i++)
            if (a[i] != b[i])
                return false ;
        
        return true ;
    }
}