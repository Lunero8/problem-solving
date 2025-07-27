/**
 *    author:  Lunero
 *    created: 28.07.2025 00:07:28
 *    link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
**/

class Solution {
    public int strStr(String haystack, String needle) {
        int a = haystack.length() , b = needle.length() ;

        for (int i = 0 ; i < a - b + 1 ; i++)
        {
            if (haystack.substring(i, i+b).equals(needle))
                return i ;
        }

        return -1 ;
    }
}