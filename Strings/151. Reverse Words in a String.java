/**
 *    author:  Lunero
 *    created: 27.07.2025 23:42:40
 *    link: https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
**/

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+") ;

        StringBuilder result = new StringBuilder () ;
        
        for (int i = words.length - 1 ; i >= 0 ; i--)
        {
            result.append (words[i]) ;
            if (i != 0)
                result.append (" ") ;
        }

        return result.toString().trim() ;
    }
}